/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.cpreprocess;

import at.jku.weiner.cpreprocess.formatting2.CPreprocessFormatter;
import at.jku.weiner.cpreprocess.generator.CPreprocessGenerator;
import at.jku.weiner.cpreprocess.parser.antlr.CPreprocessAntlrTokenFileProvider;
import at.jku.weiner.cpreprocess.parser.antlr.CPreprocessParser;
import at.jku.weiner.cpreprocess.parser.antlr.lexer.InternalCPreprocessLexer;
import at.jku.weiner.cpreprocess.scoping.CPreprocessScopeProvider;
import at.jku.weiner.cpreprocess.serializer.CPreprocessSemanticSequencer;
import at.jku.weiner.cpreprocess.serializer.CPreprocessSyntacticSequencer;
import at.jku.weiner.cpreprocess.services.CPreprocessGrammarAccess;
import at.jku.weiner.cpreprocess.validation.CPreprocessValidator;
import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;
import java.util.Properties;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.common.types.DefaultCommonTypesRuntimeModule;
import org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider;
import org.eclipse.xtext.formatting2.FormatterPreferenceValuesProvider;
import org.eclipse.xtext.formatting2.FormatterPreferences;
import org.eclipse.xtext.formatting2.IFormatter2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ITokenToStringConverter;
import org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider;
import org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.preferences.IPreferenceValuesProvider;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.resource.containers.ResourceSetBasedAllContainersStateProvider;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ISyntacticSequencer;
import org.eclipse.xtext.service.SingletonBinding;

/**
 * Manual modifications go to {@link CPreprocessRuntimeModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractCPreprocessRuntimeModule extends DefaultCommonTypesRuntimeModule {

	protected Properties properties = null;

	@Override
	public void configure(Binder binder) {
		properties = tryBindProperties(binder, "at/jku/weiner/cpreprocess/CPreprocess.properties");
		super.configure(binder);
	}
	
	public void configureLanguageName(Binder binder) {
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("at.jku.weiner.cpreprocess.CPreprocess");
	}
	
	public void configureFileExtensions(Binder binder) {
		if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
			binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("c,h");
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessFragment2
	public ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessFragment2
	public Class<? extends IGrammarAccess> bindIGrammarAccess() {
		return CPreprocessGrammarAccess.class;
	}
	
	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends ISemanticSequencer> bindISemanticSequencer() {
		return CPreprocessSemanticSequencer.class;
	}
	
	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends ISyntacticSequencer> bindISyntacticSequencer() {
		return CPreprocessSyntacticSequencer.class;
	}
	
	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends ISerializer> bindISerializer() {
		return Serializer.class;
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment
	public Class<? extends IParser> bindIParser() {
		return CPreprocessParser.class;
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment
	public Class<? extends ITokenToStringConverter> bindITokenToStringConverter() {
		return AntlrTokenToStringConverter.class;
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment
	public Class<? extends IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return CPreprocessAntlrTokenFileProvider.class;
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment
	public Class<? extends Lexer> bindLexer() {
		return InternalCPreprocessLexer.class;
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment
	public Provider<InternalCPreprocessLexer> provideInternalCPreprocessLexer() {
		return org.eclipse.xtext.parser.antlr.LexerProvider.create(at.jku.weiner.cpreprocess.parser.antlr.lexer.InternalCPreprocessLexer.class);
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment
	public void configureRuntimeLexer(Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME)).to(at.jku.weiner.cpreprocess.parser.antlr.lexer.InternalCPreprocessLexer.class);
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment
	public Class<? extends ITokenDefProvider> bindITokenDefProvider() {
		return AntlrTokenDefProvider.class;
	}
	
	// contributed by org.eclipse.xtext.generator.validation.ValidatorFragment
	@SingletonBinding(eager=true)
	public Class<? extends CPreprocessValidator> bindCPreprocessValidator() {
		return CPreprocessValidator.class;
	}
	
	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return CPreprocessScopeProvider.class;
	}
	
	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider.class);
	}
	
	// contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	public void configureIgnoreCaseLinking(Binder binder) {
		binder.bindConstant().annotatedWith(org.eclipse.xtext.scoping.IgnoreCaseLinking.class).to(false);
	}
	
	// contributed by org.eclipse.xtext.generator.exporting.QualifiedNamesFragment
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return DefaultDeclarativeQualifiedNameProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.generator.GeneratorFragment2
	public Class<? extends IGenerator> bindIGenerator() {
		return CPreprocessGenerator.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.formatting.Formatter2Fragment2
	public Class<? extends IFormatter2> bindIFormatter2() {
		return CPreprocessFormatter.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.formatting.Formatter2Fragment2
	public void configureFormatterPreferences(Binder binder) {
		binder.bind(IPreferenceValuesProvider.class).annotatedWith(FormatterPreferences.class).to(FormatterPreferenceValuesProvider.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
	public Class<? extends IContainer.Manager> bindIContainer$Manager() {
		return StateBasedContainerManager.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
	public Class<? extends IAllContainersState.Provider> bindIAllContainersState$Provider() {
		return ResourceSetBasedAllContainersStateProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
	public void configureIResourceDescriptions(Binder binder) {
		binder.bind(IResourceDescriptions.class).to(ResourceSetBasedResourceDescriptions.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
	public void configureIResourceDescriptionsPersisted(Binder binder) {
		binder.bind(IResourceDescriptions.class).annotatedWith(Names.named(ResourceDescriptionsProvider.PERSISTED_DESCRIPTIONS)).to(ResourceSetBasedResourceDescriptions.class);
	}
	
	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return TypesAwareDefaultGlobalScopeProvider.class;
	}
	
}
