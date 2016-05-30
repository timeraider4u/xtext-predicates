package at.jku.weiner.antlr4;

import java.util.Collections;

import org.antlr.parser.antlr4.ANTLRv4Lexer;
import org.antlr.parser.antlr4.ANTLRv4Parser;
import org.antlr.parser.antlr4.ANTLRv4Parser.GrammarSpecContext;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;

import at.jku.weiner.kefax.shared.MyActionHandler;
import at.jku.weiner.log.MyLog;

public class Antlr4Action extends MyActionHandler {
	
	private static final String	ANTLR_GEN		= "src-gen";
	private static final String	OUTPUT_FOLDER	= "bin";

	private static final String	PREFIX			= "hello";
	private static final String	NS_URI			= "http://www.jku.at/weiner/hello";
	private static final String	PACKAGE			= "my.mydefault.mysecond.third";
	
	public Antlr4Action() {
		super("at.jku.weiner.antlr4");
	}
	
	@Override
	protected void myRun() throws Exception {
		// get project scope
		MyLog.setLog_level(MyLog.LOG_INFO);
		final IResource antlrG4File = GeneratorUtils.getIResourceFor(this
				.getEvent());
		final IProject project = antlrG4File.getProject();
		// create java project
		final IJavaProject javaProject = GeneratorUtils.addJavaNature(project,
				this.getMonitor());
		final IClasspathEntry projectEntry = JavaCore.newSourceEntry(project
				.getFullPath());
		GeneratorUtils.removeClassPathEntry(javaProject, projectEntry,
				this.getMonitor());
		project.refreshLocal(IResource.DEPTH_INFINITE, this.getMonitor());
		// set-up project
		final String antlrG4FileName = GeneratorUtils
				.getAbsoluteFileNameFor(antlrG4File);
		final IFolder myGenFolder = GeneratorUtils
				.createSrcGenFolder(project, Antlr4Action.ANTLR_GEN,
						Antlr4Action.PACKAGE, this.getMonitor());
		final IFolder mySrcGenFolder = project
				.getFolder(Antlr4Action.ANTLR_GEN);
		final String myGenFolderName = GeneratorUtils
				.getAbsoluteFileNameFor(myGenFolder);
		// run ANTLR4 tool
		GeneratorUtils.runAntlr4Tool(Antlr4Action.PACKAGE, antlrG4FileName,
				myGenFolderName);
		// copy ANTLR4 JAR library
		final IFile dstLibFile = GeneratorUtils.copyLibTo(project,
				this.getMonitor());
		project.refreshLocal(IResource.DEPTH_INFINITE, this.getMonitor());
		// create output folder
		final IFolder binFolder = project.getFolder(Antlr4Action.OUTPUT_FOLDER);
		if (!binFolder.exists()) {
			binFolder.create(true, true, this.getMonitor());
		}
		javaProject.setOutputLocation(binFolder.getFullPath(),
				this.getMonitor());
		// set-up class-path entries
		final IClasspathEntry clazzPathEntry = JavaRuntime
				.getDefaultJREContainerEntry();
		GeneratorUtils.addClassPathEntry(javaProject, clazzPathEntry,
				this.getMonitor());
		GeneratorUtils.addClassPathEntry(javaProject, mySrcGenFolder,
				this.getMonitor());
		final IClasspathEntry libPathEntry = JavaCore.newLibraryEntry(
				dstLibFile.getFullPath(), null, null);
		GeneratorUtils.addClassPathEntry(javaProject, libPathEntry,
				this.getMonitor());

		project.refreshLocal(IResource.DEPTH_INFINITE, this.getMonitor());
		// return;

		this.runParserAndListener(antlrG4FileName);
		
		// final URL url = bundle.getEntry(Main.FILE_NAME1);
		// final URL fileURL = FileLocator.toFileURL(url);
		// final String fileName = fileURL.getFile();
		// final String result = Main.runInternal(fileName);
		// MyLog.log(Antlr4Action.class, "result='" + result + "'");
		
		// final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		// final IProject project = root.getProject(Antlr4Action.PREFIX);
		// if (!project.exists()) {
		// project.create(this.getMonitor());
		// }
		// project.open(this.getMonitor());
		//
		// final ResourceSet resourceSet = new ResourceSetImpl();
		// resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		// .put("ecore", new EcoreResourceFactoryImpl());
		// resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		// .put("xmi", new XMIResourceFactoryImpl());
		// final IFolder folder = project.getFolder("model");
		// if (!folder.exists()) {
		// folder.create(true, true, this.getMonitor());
		// }
		// final IFile res = folder.getFile("hello.ecore");
		// final IPath path = res.getLocation();
		// final String string = path.toOSString();
		// final URI uri = URI.createFileURI(string);
		// final String string = res.getLocation().toOSString();
		// final java.net.URI uri = java.net.URI.createFileURI("./univ.ecore");
		// final String string = uri.toString();
		// System.out.println("string='" + string + "'");
		// final String fileString = uri.toFileString();
		// System.out.println("fileString='" + fileString + "'");
		// final Resource myMetaModel = resourceSet.createResource(uri);
		// final EcoreFactory theCoreFactory = EcoreFactory.eINSTANCE;
		// final EPackage univEPackage = theCoreFactory.createEPackage();
		// univEPackage.setName(Antlr4Action.PREFIX);
		// univEPackage.setNsPrefix(Antlr4Action.PREFIX);
		// univEPackage.setNsURI(Antlr4Action.NS_URI);
		// // final EFactory factory =
		// // univEPackage.setEFactoryInstance(factory);
		// final EClass clazz = theCoreFactory.createEClass();
		// clazz.setInterface(false);
		// clazz.setAbstract(false);
		// clazz.setName("HelloClass");
		// final EAttribute attribute = theCoreFactory.createEAttribute();
		// attribute.setName("message");
		// attribute.setEType(EcorePackage.eINSTANCE.getEString());
		// attribute.setID(false);
		// attribute.setChangeable(true);
		// attribute.setLowerBound(0);
		// attribute.setUpperBound(1);
		// clazz.getEStructuralFeatures().add(attribute);
		// univEPackage.getEClassifiers().add(clazz);
		// myMetaModel.getContents().add(univEPackage);
		//
		// // register locally
		// resourceSet.getPackageRegistry().put(Antlr4Action.NS_URI,
		// univEPackage);
		// // register globally
		// EPackage.Registry.INSTANCE.put(Antlr4Action.NS_URI, univEPackage);
		// myMetaModel.save(null);
		// System.out.println("ePackage.getEFactory='"
		// + univEPackage.getEFactoryInstance() + "'");
		// System.out.println("myMetaModel.getResourceSet()='"
		// + myMetaModel.getResourceSet() + "'");
		// System.out.println("myMetaModel.getContents().size()='"
		// + myMetaModel.getContents().size() + "'");
		// project.refreshLocal(IResource.DEPTH_INFINITE, this.getMonitor());
		// // create genmodel
		// final IFile genModel = folder.getFile("hello.genmodel");
		// final IPath pathGenModel = genModel.getLocation();
		// final String stringGenModel = pathGenModel.toOSString();
		// this.createGenModel(univEPackage, string, stringGenModel, project);
		// project.refreshLocal(IResource.DEPTH_INFINITE, this.getMonitor());
		// // create instance
		// final IFile resInst = folder.getFile("hello.xmi");
		// final IPath pathInst = resInst.getLocation();
		// final String stringInst = pathInst.toOSString();
		// final URI uriInst = URI.createFileURI(stringInst);
		// final Resource myModel = resourceSet.createResource(uriInst);
		// final EFactory univInstance = univEPackage.getEFactoryInstance();
		// final EObject adultObject = univInstance.create(clazz);
		// adultObject.eSet(attribute, "Hello World!");
		//
		// myModel.getContents().add(adultObject);
		// myModel.save(null);
		// System.out.println("myModel.getResourceSet()='"
		// + myModel.getResourceSet() + "'");
		// System.out.println("myModel.getContents().size()='"
		// + myModel.getContents().size() + "'");
		//
		// project.refreshLocal(IResource.DEPTH_INFINITE, this.getMonitor());
		
	}
	
	private String runParserAndListener(final String antlrG4FileName)
			throws Exception {
		// Set-up parser
		final ANTLRv4Parser parser = Antlr4Action.getParser(antlrG4FileName);
		// Specify our entry point
		final GrammarSpecContext context = parser.grammarSpec();
		
		// Walk it and attach our listener
		final ParseTreeWalker walker = new ParseTreeWalker();
		final Antlr4MyListener listener = new Antlr4MyListener();
		walker.walk(listener, context);
		
		final String result = listener.toString();
		return result;
	}
	
	public static ANTLRv4Parser getParser(final String fileName)
			throws Exception {
		final ANTLRFileStream fileStream = new ANTLRFileStream(fileName);
		final ANTLRv4Lexer lexer = new ANTLRv4Lexer(fileStream);
		final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		final ANTLRv4Parser parser = new ANTLRv4Parser(tokenStream);
		parser.setBuildParseTree(true);
		return parser;
	}
	
	private void createGenModel(final EPackage rootPackage,
			final String ecoreLocation, final String genModelLocation,
			final IProject project) throws Exception {
		
		final GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK70_LITERAL);
		final IFile genDir = project.getFile("emf-gen");
		final IPath pathGenDir = genDir.getFullPath();
		final String stringGenDir = pathGenDir.toString();
		genModel.setModelDirectory(stringGenDir);
		genModel.getForeignModel().add(new Path(ecoreLocation).lastSegment());
		final String name = rootPackage.getName();
		genModel.setModelName(name);
		genModel.setRootExtendsInterface("org.eclipse.emf.ecore.EObject");
		genModel.initialize(Collections.singleton(rootPackage));
		genModel.setOperationReflection(true);
		genModel.setEditorPluginID(name + ".edit");
		genModel.setEditorPluginID(name + ".editor");
		genModel.setModelPluginID(name);
		genModel.setTestsPluginID(name + ".tests");
		
		final GenPackage genPackage = genModel.getGenPackages().get(0);
		genPackage.setPrefix(rootPackage.getNsPrefix());
		
		final URI genModelURI = URI.createFileURI(genModelLocation);
		final XMIResourceImpl genModelResource = new XMIResourceImpl(
				genModelURI);
		genModelResource.getDefaultSaveOptions().put(
				XMLResource.OPTION_ENCODING, GeneratorUtils.ENCODING);
		genModelResource.getContents().add(genModel);
		genModelResource.save(Collections.EMPTY_MAP);
		
	}
}
