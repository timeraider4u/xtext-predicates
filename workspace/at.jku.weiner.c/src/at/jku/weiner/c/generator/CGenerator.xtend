/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.jku.weiner.c.c.Model
import at.jku.weiner.c.c.TranslationUnit
import at.jku.weiner.c.c.ExternalDeclaration
import at.jku.weiner.c.c.Declaration
import at.jku.weiner.c.c.DeclarationSpecifiers
import at.jku.weiner.c.c.StorageClassSpecifier
import at.jku.weiner.c.c.TypeSpecifier
import at.jku.weiner.c.c.TypeQualifier
import at.jku.weiner.c.c.StructOrUnionSpecifier
import at.jku.weiner.c.c.InitDeclaratorList
import at.jku.weiner.c.c.InitDeclarator
import at.jku.weiner.c.c.DirectDeclarator
import at.jku.weiner.c.c.Declarator
import at.jku.weiner.c.c.FunctionDefHead
import at.jku.weiner.c.c.FunctionDeclarationSpecifiers
import at.jku.weiner.c.c.FunctionDefinition
import at.jku.weiner.c.c.Statement
import at.jku.weiner.c.c.DeclaratorSuffix
import at.jku.weiner.c.c.DirectDeclaratorLastSuffix
import at.jku.weiner.c.c.IdentifierList
import at.jku.weiner.c.c.ParameterTypeList
import at.jku.weiner.c.c.ParameterList
import at.jku.weiner.c.c.ParameterDeclaration
import org.eclipse.xtend.lib.annotations.Accessors
import at.jku.weiner.c.c.LabeledStatement
import at.jku.weiner.c.c.CompoundStatement
import at.jku.weiner.c.c.BodyStatement
import at.jku.weiner.c.c.ExpressionStatement
import at.jku.weiner.c.c.SelectionStatement
import at.jku.weiner.c.c.IterationStatement
import at.jku.weiner.c.c.JumpStatement
import at.jku.weiner.c.c.AsmStatement
import at.jku.weiner.c.c.Expression
import at.jku.weiner.c.c.AssignmentExpression
import at.jku.weiner.c.c.AssignmentOperator
import at.jku.weiner.c.c.ConditionalExpression
import at.jku.weiner.c.c.LogicalOrExpression
import at.jku.weiner.c.c.LogicalAndExpression
import at.jku.weiner.c.c.InclusiveOrExpression
import at.jku.weiner.c.c.ExclusiveOrExpression
import at.jku.weiner.c.c.AndExpression
import at.jku.weiner.c.c.EqualityExpression
import at.jku.weiner.c.c.RelationalExpression
import at.jku.weiner.c.c.ShiftExpression
import at.jku.weiner.c.c.AdditiveExpression
import at.jku.weiner.c.c.MultiplicativeExpression
import at.jku.weiner.c.c.CastExpression
import at.jku.weiner.c.c.UnaryExpression
import at.jku.weiner.c.c.UnaryOperator
import at.jku.weiner.c.c.PostfixExpression
import at.jku.weiner.c.c.PrimaryExpression
import at.jku.weiner.c.c.Constant
import at.jku.weiner.c.c.ConstantExpression
import at.jku.weiner.c.c.BlockList
import at.jku.weiner.c.c.TypeName
import at.jku.weiner.c.c.SpecifierQualifierList
import at.jku.weiner.c.c.StructDeclarationList
import at.jku.weiner.c.c.StructDeclaration
import at.jku.weiner.c.c.StructDeclarator
import at.jku.weiner.c.c.StructDeclaratorList
import at.jku.weiner.c.c.ArgumentExpressionList
import at.jku.weiner.c.c.Pointer
import at.jku.weiner.c.c.TypeQualifierList
import at.jku.weiner.c.c.Initializer
import at.jku.weiner.c.c.InitializerList
import at.jku.weiner.c.c.AsmLineWithColon
import at.jku.weiner.c.c.AsmLineWithComma
import at.jku.weiner.c.c.FunctionSpecifier
import at.jku.weiner.c.c.EnumSpecifier
import at.jku.weiner.c.c.EnumeratorList
import at.jku.weiner.c.c.Enumerator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CGenerator implements IGenerator {
	
	@Accessors String fileName = 'greetings.txt';
	
	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		val model = input.allContents.filter(typeof(Model)).head;
		val unit = model.unit.head;
		val output = outputFor(unit);
		fsa.generateFile(fileName, output);
	}

	def String outputFor(TranslationUnit unit) '''
		«FOR e : unit.external»
			«outputFor(e)»
		«ENDFOR»
	'''
	
	def String outputFor(ExternalDeclaration dec) '''
		«IF dec.functiondefHead != null»
			«outputFor(dec.functiondefHead)» {
				«outputFor(dec.functionDefinition)»
			}
		«ENDIF»
		«outputFor(dec.declaration)»
		«IF dec.semi != null»
			«dec.semi»
		«ENDIF»
	'''
	
	def String outputFor(FunctionDefHead dec) '''
		«IF dec.funDeclSpecifiers != null»
			«outputFor(dec.funDeclSpecifiers)»
		«ENDIF»
		«outputFor(dec.funDeclarator)»
		«FOR f : dec.funDeclaration»
			«outputFor(f)»
		«ENDFOR»
	'''
	
	def String outputFor(FunctionDeclarationSpecifiers spec) '''
		«FOR s : spec.declarationSpecifier»
			«IF s instanceof StorageClassSpecifier»
			«outputFor(s)»
			«ENDIF»
			«IF s instanceof TypeSpecifier»
			«outputFor(s)»
			«ENDIF»
			«IF s instanceof TypeQualifier»
			«outputFor(s)»
			«ENDIF»
			«IF s instanceof FunctionSpecifier»
			«outputFor(s)»
			«ENDIF»
		«ENDFOR»
	'''
	
	def String outputFor(FunctionDefinition obj) '''
		«outputFor(obj.body)»
	'''
	
	def String outputFor(Declaration dec) '''
		«IF dec != null»
			«outputFor(dec.specifiers)»
			«FOR list : dec.initDeclaratorList»
				«outputFor(list)»
			«ENDFOR»
			«IF dec.semi != null»
				«dec.semi»
			«ENDIF»
		«ENDIF»
	'''
	
	def String outputFor(DeclarationSpecifiers spec) '''
		«FOR s : spec.declarationSpecifier»
			«IF s instanceof StorageClassSpecifier»
			«outputFor(s)»
			«ENDIF»
			«IF s instanceof TypeSpecifier»
			«outputFor(s)»
			«ENDIF»
			«IF s instanceof TypeQualifier»
			«outputFor(s)»
			«ENDIF»
			«IF s instanceof StructOrUnionSpecifier»
			«outputFor(s)»
			«ENDIF»
		«ENDFOR»
	'''
	
	def String outputFor(StorageClassSpecifier spec) '''
		«spec.name»
	'''
	
	def String outputFor(TypeQualifier spec) '''
		«spec.type»
	'''
	
	def String outputFor(FunctionSpecifier spec) '''
		«spec.name»
	'''
	
	def String outputFor(TypeSpecifier spec) '''
		«IF spec.specifier != null»
			«IF spec.specifier instanceof EnumSpecifier»
				«outputFor(spec.specifier as EnumSpecifier)»
			«ENDIF»
		«ENDIF»
		«IF spec.type != null»
			«spec.type.id»
		«ENDIF»
		«IF spec.name != null»
			«spec.name»
		«ENDIF»
	'''
	
	def String outputFor(StructOrUnionSpecifier obj) '''
		«obj.type.name» «IF obj.id != null»«obj.id»«ENDIF»
		«IF obj.structDeclList != null»{«outputFor(obj.structDeclList)»}«ENDIF»
	'''
	
	def String outputFor(StructDeclarationList obj) '''
		«FOR s: obj.structDeclaration»
			«outputFor(s)»
		«ENDFOR»
	'''
	
	def String outputFor(StructDeclaration obj) '''
		«outputFor(obj.list)»
		«IF obj.structDeclarationList != null»«outputFor(obj.structDeclarationList)»«ENDIF»;
	'''
	
	def String outputFor(StructDeclaratorList obj) '''
		«FOR p : obj.structDeclarator»
			«IF obj.structDeclarator.indexOf(p) > 0», «ENDIF»
			«outputFor(p)»
		«ENDFOR»
	''' 
	
	def String outputFor(StructDeclarator obj) '''
		«IF obj.declarator != null»«outputFor(obj.declarator)»«ENDIF»
		«IF obj.constExpr != null && obj.constExpr.size > 0»:
		«FOR e: obj.constExpr»
			«outputForConstantExpression(e as ConstantExpression)»
		«ENDFOR»
		«ENDIF»
	'''
	
	def String outputFor(EnumSpecifier obj) '''
		enum «IF obj.id != null»«obj.id»«ENDIF»
		«IF obj.enumList != null»
			{
				«outputFor(obj.enumList)»
			}
		«ENDIF»
	'''
	
	def String outputFor(EnumeratorList obj) '''
		«FOR e : obj.enumerator»
			«IF obj.enumerator.indexOf(e) > 0», «ENDIF»
			«outputFor(e)»
		«ENDFOR»
	'''
	
	def String outputFor(Enumerator obj) '''
		«obj.id»
		«IF obj.expr != null»
			=
			«outputForConstantExpression(obj.expr as ConstantExpression)»
		«ENDIF»
	'''
	
	def String outputFor(InitDeclaratorList list) '''
		«FOR initDeclarator : list.initDeclarator»
			«IF list.initDeclarator.indexOf(initDeclarator) > 0», «ENDIF»
			«outputFor(initDeclarator)»
		«ENDFOR»
	'''
	
	def String outputFor(InitDeclarator decl) '''
		«outputFor(decl.declarator)»
		«IF decl.initializer != null»
			= «outputFor(decl.initializer)»
		«ENDIF»
	'''
	
	def String outputFor(Declarator decl) '''
		«IF decl.pointer != null»«outputFor(decl.pointer)»«ENDIF»
		«outputFor(decl.declarator)»
	'''
	
	def String outputFor(DirectDeclarator decl) '''
		«IF decl.id != null»
		«decl.id»
		«ELSE»
		(«outputFor(decl.declarator)»)
		«ENDIF»
		«FOR d : decl.declaratorSuffix»
			«outputFor(d)»
		«ENDFOR»
	'''
	
	def String outputFor(DeclaratorSuffix obj) '''
		«IF obj.lastSuffix != null»
			«outputFor(obj.lastSuffix)»
		«ELSE»
			[
			«IF obj.typeQualifierList != null»
				«outputFor(obj.typeQualifierList)»
			«ENDIF»
			«IF obj.expr != null»
				«outputForAssignmentExpression(obj.expr as AssignmentExpression)»
			«ENDIF»
			]
		«ENDIF»
	'''
	
	def String outputFor(DirectDeclaratorLastSuffix obj) '''
		(
		«IF obj.parameterTypeList != null»
			«FOR l : obj.parameterTypeList»
				«outputFor(l)»
			«ENDFOR»
		«ENDIF»
		«IF obj.identifierList != null»
			«outputFor(obj.identifierList)»
		«ENDIF»
		)
	'''
	
	def String outputFor(Pointer obj) '''
		«FOR s: obj.star»«s»«ENDFOR»
		«FOR c: obj.caret»«c»«ENDFOR»
		«FOR t: obj.typeQualifierList»«outputFor(t)»«ENDFOR»
	'''
	
	def String outputFor(TypeQualifierList l) '''
		«FOR t : l.typeQualifier»
			«outputFor(t)»
		«ENDFOR»
	'''
	
	def String outputFor(ParameterTypeList obj) '''
	«IF obj != null»
		«outputFor(obj.list)»
	«ENDIF»
	'''
	
	def String outputFor(ParameterList obj) '''
		«FOR p : obj.parameterDeclaration»
			«IF obj.parameterDeclaration.indexOf(p) > 0», «ENDIF»
			«outputFor(p)»
		«ENDFOR»
	'''
	
	def String outputFor(ParameterDeclaration obj) '''
		«outputFor(obj.declSpecifiers)»
		«IF obj.declarator != null»
			«outputFor(obj.declarator)»
		«ENDIF»
	''' 
	
	def String outputFor(IdentifierList obj) '''
		«FOR i : obj.id»
			«IF obj.id.indexOf(i) > 0», «ENDIF»
			«i.id»
		«ENDFOR»
	'''
	
	def String outputFor(Initializer obj) '''
		«IF obj.expr != null»
			«outputForAssignmentExpression(obj.expr as AssignmentExpression)»
		«ENDIF»
		«IF obj.list != null»
			{	«outputFor(obj.list)» }
		«ENDIF»
	'''
	
	def String outputFor(InitializerList obj) '''
		«FOR i : obj.initializer»
			«IF obj.initializer.indexOf(i) > 0», «ENDIF»
			«outputFor(i)»
		«ENDFOR»
	'''
	
	def String outputFor(Statement obj) '''
		«IF obj.stmt != null»«outputFor(obj.stmt)»«ENDIF»
		«IF obj instanceof LabeledStatement»«outputForLabeledStatement(obj)»«ENDIF»
		«IF obj instanceof CompoundStatement»«outputForCompoundStatement(obj)»«ENDIF»
		«IF obj instanceof BodyStatement»«outputForBodyStatement(obj)»«ENDIF»
		«IF obj instanceof ExpressionStatement»«outputForExpressionStatement(obj)»«ENDIF»
		«IF obj instanceof SelectionStatement»«outputForSelectionStatement(obj)»«ENDIF»
		«IF obj instanceof IterationStatement»«outputForIterationStatement(obj)»«ENDIF»
		«IF obj instanceof JumpStatement»«outputForJumpStatement(obj)»«ENDIF»
		«IF obj instanceof AsmStatement»«outputForAsmStatement(obj)»«ENDIF»
	'''
	
	def String outputForLabeledStatement(LabeledStatement obj) '''
		«IF obj.id != null»«obj.id»:«outputFor(obj.LStmt)»«ENDIF»
		«IF obj.getCase() != null»case «outputForConstantExpression(obj.expr as ConstantExpression)»:«outputFor(obj.LStmt)»«ENDIF»
		«IF obj.getDefault() != null»default: «outputFor(obj.LStmt)»«ENDIF»
	'''
	
	def String outputForCompoundStatement(CompoundStatement obj) '''
		{
			«outputFor(obj.body)»
		}
	'''
	
	def String outputForBodyStatement(BodyStatement obj) '''
		«FOR l : obj.blockList»
			«outputFor(l)»
		«ENDFOR»
	'''
	
	def String outputFor(BlockList obj) '''
		«FOR d : obj.declaration»
			«outputFor(d)»
		«ENDFOR»
		«FOR s : obj.statement»
			«outputFor(s)»
		«ENDFOR»
	'''
	
	def String outputForExpressionStatement(ExpressionStatement obj) '''
		«IF obj.expression != null»«outputFor(obj.expression)»«ENDIF»;
	'''
	
	def String outputForSelectionStatement(SelectionStatement obj) '''
		«IF obj.getIf() != null»
			if («outputFor(obj.expr)»)
			«outputFor(obj.ifStatement)»
			«IF obj.getElse() != null»
				else «outputFor(obj.elseStatement)»
			«ENDIF»
		«ENDIF»
		«IF obj.getSwitch() != null»
			switch («outputFor(obj.expr)»)
			«outputFor(obj.switchStatement)»
		«ENDIF»
	'''
	
	def String outputForIterationStatement(IterationStatement obj) '''
		«IF obj.getWhile() != null»
			while («outputFor(obj.expr)»)
			«outputFor(obj.statement)»
		«ENDIF»
		«IF obj.getDo() != null»
			do
				«outputFor(obj.statement)»
			while («outputFor(obj.expr)»);
		«ENDIF»
		«IF obj.getFor() != null»
			for (
				«IF obj.initExpr != null»
					«outputFor(obj.initExpr)»
					;
				«ENDIF»
				«IF obj.initDecl != null»
					«outputFor(obj.initDecl)»
				«ENDIF»
				«IF obj.expr != null»
					«outputFor(obj.expr)»
				«ENDIF»
				;
				«IF obj.incExpr != null»
					«outputFor(obj.incExpr)»
				«ENDIF»
			)
			«outputFor(obj.statement)»
		«ENDIF»
	'''
	
	def String outputForJumpStatement(JumpStatement obj) '''
		«IF obj.continue != null»continue;«ENDIF»
		«IF obj.break != null»break;«ENDIF»
		«IF obj.getReturn() != null»return «IF obj.expr != null»«outputFor(obj.expr)»«ENDIF» ;«ENDIF»
		«IF obj.goto != null»goto «outputForUnaryExpression(obj.expr as UnaryExpression)»;«ENDIF»
	'''
	
	def String outputForAsmStatement(AsmStatement obj) '''
		«obj.asm» 
		«IF obj.volatile != null»
			«obj.volatile» 
		«ENDIF»
		(
			«FOR l: obj.asmLine»
				«IF l instanceof AsmLineWithColon»
					«outputFor(l as AsmLineWithColon)»
				«ELSE»
					«outputFor(l as AsmLineWithComma)»
				«ENDIF»
			«ENDFOR»
		);
	'''
	
	def String outputFor(AsmLineWithColon obj) '''
		«IF obj.colon»: «ENDIF»
		«outputForLogicalOrExpression(obj.expr as LogicalOrExpression)»
	'''
	
	def String outputFor(AsmLineWithComma obj) '''
		,
		«outputForLogicalOrExpression(obj.expr as LogicalOrExpression)»
	'''
	
	def String outputFor(Expression obj) '''
		«FOR e : obj.exprExpr»
			«IF obj.exprExpr.indexOf(e) > 0», «ENDIF»
			«outputForAssignmentExpression(e as AssignmentExpression)»
		«ENDFOR»
	'''
	
	def String outputForAssignmentExpression(AssignmentExpression obj) '''
		«IF obj.op != null»
			«outputForUnaryExpression(obj.expr as UnaryExpression)»
			«outputFor(obj.op)»
			«IF obj.assignmentExpr != null»
				«outputForAssignmentExpression(obj.assignmentExpr as AssignmentExpression)»
			«ENDIF»
		«ELSE»
			«outputForConditionalExpression(obj.expr as ConditionalExpression)»
		«ENDIF»
	'''
	
	def String outputFor(AssignmentOperator obj) '''
		«obj.op»
	'''
	
	def String outputForConditionalExpression(ConditionalExpression obj) '''
		«outputForLogicalOrExpression(obj.expr as LogicalOrExpression)»
		«IF obj.QExpr != null»
			?«outputFor(obj.QExpr)»:
			«outputForConditionalExpression(obj.CExpr as ConditionalExpression)»
		«ENDIF»
	'''
	
	def String outputForLogicalOrExpression(LogicalOrExpression obj) '''
		«FOR e : obj.expr»
			«IF obj.expr.indexOf(e) > 0»||«ENDIF»
			«outputForLogicalAndExpression(e as LogicalAndExpression)»
		«ENDFOR»
	'''
	
	def String outputForLogicalAndExpression(LogicalAndExpression obj) '''
		«FOR e : obj.expr»
			«IF obj.expr.indexOf(e) > 0»&&«ENDIF»
			«outputForInclusiveOrExpression(e as InclusiveOrExpression)»
		«ENDFOR»
	'''
	
	def String outputForInclusiveOrExpression(InclusiveOrExpression obj) '''
		«FOR e : obj.expr»
			«IF obj.expr.indexOf(e) > 0»|«ENDIF»
			«outputForExclusiveOrExpression(e as ExclusiveOrExpression)»
		«ENDFOR»
	'''
	
	def String outputForExclusiveOrExpression(ExclusiveOrExpression obj) '''
		«FOR e : obj.expr»
			«IF obj.expr.indexOf(e) > 0»^«ENDIF»
			«outputForAndExpression(e as AndExpression)»
		«ENDFOR»
	'''
	
	def String outputForAndExpression(AndExpression obj) '''
		«FOR e : obj.expr»
			«IF obj.expr.indexOf(e) > 0»&«ENDIF»
			«outputForEqualityExpression(e as EqualityExpression)»
		«ENDFOR»
	'''
	
	def String outputForEqualityExpression(EqualityExpression obj) '''
		«FOR e : obj.expr»
			«IF obj.expr.indexOf(e) > 0»«obj.op.get(obj.expr.indexOf(e)-1)»«ENDIF»
			«outputForRelationalExpression(e as RelationalExpression)»
		«ENDFOR»
	'''
	
	def String outputForRelationalExpression(RelationalExpression obj) '''
		«FOR e : obj.expr»
			«IF obj.expr.indexOf(e) > 0»«obj.op.get(obj.expr.indexOf(e)-1)»«ENDIF»
			«outputForShiftExpression(e as ShiftExpression)»
		«ENDFOR»
	'''
	
	def String outputForShiftExpression(ShiftExpression obj) '''
		«FOR e : obj.expr»
			«IF obj.expr.indexOf(e) > 0»«obj.op.get(obj.expr.indexOf(e)-1)»«ENDIF»
			«outputForAdditiveExpression(e as AdditiveExpression)»
		«ENDFOR»
	'''
	
	def String outputForAdditiveExpression(AdditiveExpression obj) '''
		«FOR e : obj.expr»
			«IF obj.expr.indexOf(e) > 0»«obj.op.get(obj.expr.indexOf(e)-1)»«ENDIF»
			«outputForMultiplicativeExpression(e as MultiplicativeExpression)»
		«ENDFOR»
	'''
	
	def String outputForMultiplicativeExpression(MultiplicativeExpression obj) '''
		«FOR e : obj.expr»
			«IF obj.expr.indexOf(e) > 0»«obj.op.get(obj.expr.indexOf(e)-1)»«ENDIF»
			«outputForCastExpression(e as CastExpression)»
		«ENDFOR»
	'''
	
	def String outputForCastExpression(CastExpression obj) '''
		«IF obj.type != null»
			(«outputFor(obj.type)»)
			«outputForCastExpression(obj.expr as CastExpression)»
		«ELSE»
			«outputForUnaryExpression(obj.expr as UnaryExpression)»
		«ENDIF»
	'''
	
	def String outputFor(TypeName obj) '''
		«outputFor(obj.list)»
	'''
	
	def String outputFor(SpecifierQualifierList obj) '''
		«FOR x : obj.typeSpecifier»
			«outputFor(x as TypeSpecifier)»
		«ENDFOR»
		«FOR x : obj.typeQualifier»
			«outputFor(x as TypeQualifier)»
		«ENDFOR»
		«FOR x : obj.structOrUnionSpecifier»
			«outputFor(x as StructOrUnionSpecifier)»
		«ENDFOR»
	'''
	
	def String outputForUnaryExpression(UnaryExpression obj) '''
		«IF obj.plusplus != null»«obj.plusplus»«outputForUnaryExpression(obj.expr as UnaryExpression)»
		«ENDIF»
		«IF obj.minusminus != null»«obj.minusminus»«outputForUnaryExpression(obj.expr as UnaryExpression)»
		«ENDIF»
		«IF obj.sizeOf != null»«obj.sizeOf»
			«IF obj.typeName != null»(«outputFor(obj.typeName)»)
			«ELSE»«outputForUnaryExpression(obj.expr as UnaryExpression)»
			«ENDIF»
		«ENDIF»
		«IF obj.op != null»«outputFor(obj.op)»«outputForCastExpression(obj.expr as CastExpression)»
		«ENDIF»
		«IF obj.expr instanceof PostfixExpression»«outputForPostfixExpression(obj.expr as PostfixExpression)»
		«ENDIF»
		«IF obj.andand != null»«obj.andand»«obj.id»
		«ENDIF»
	'''
	
	def String outputFor(UnaryOperator obj) '''
		«obj.op»
	'''
	
	def String outputForPostfixExpression(PostfixExpression obj) '''
		«FOR e : obj.expr»
			«outputForPrimaryExpression(e as PrimaryExpression)»
		«ENDFOR»
		«IF obj.arrayExpr.size > 0» [
			«FOR e: obj.arrayExpr»
				«outputFor(e)»
			«ENDFOR»
			]
		«ENDIF»
		«IF obj.argumentExpressionList != null && obj.argumentExpressionList.size > 0»
			(
			«FOR l : obj.argumentExpressionList»
				«outputFor(l)»
			«ENDFOR»
			)
		«ENDIF»
		«FOR d : obj.dot»
			«d»«obj.id.get(obj.dot.indexOf(d))»
		«ENDFOR»
		«FOR a : obj.arrow»
			«a»«obj.id.get(obj.dot.indexOf(a))»
		«ENDFOR»
		«FOR p : obj.plusplus»
			«p»
		«ENDFOR»
		«FOR m : obj.minusminus»
			«m»
		«ENDFOR»
	'''
	
	def String outputFor(ArgumentExpressionList obj) '''
		«FOR e : obj.expr»
			«IF obj.expr.indexOf(e) > 0»,«ENDIF»
			«outputForAssignmentExpression(e as AssignmentExpression)»
		«ENDFOR»
	'''
	
	def String outputForPrimaryExpression(PrimaryExpression obj) '''
		«IF obj.id != null»«obj.id»«ENDIF»
		«IF obj.const != null»«outputFor(obj.const)»«ENDIF»
		«IF obj.expr != null»(«outputFor(obj.expr)»)«ENDIF»
	'''
	
	def String outputFor(Constant obj) '''
		«IF obj.hex != null»«obj.hex»«ENDIF»
		«IF obj.oct != null»«obj.oct»«ENDIF»
		«IF obj.dec != null»«obj.dec»«ENDIF»
		«IF obj.ch != null»«obj.ch»«ENDIF»
		«IF obj.str != null»«obj.str»«ENDIF»
		«IF obj.float != null»«obj.float»«ENDIF»
		«IF obj.bin != null»«obj.bin»«ENDIF»
	'''
	
	def String outputForConstantExpression(ConstantExpression obj) '''
		«outputForConditionalExpression(obj.expr as ConditionalExpression)»
	'''
}

