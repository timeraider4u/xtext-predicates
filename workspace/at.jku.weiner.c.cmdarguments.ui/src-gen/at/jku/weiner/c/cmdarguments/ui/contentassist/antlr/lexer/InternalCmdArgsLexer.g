
/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
lexer grammar InternalCmdArgsLexer;


@header {
package at.jku.weiner.c.cmdarguments.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}






RULE_SKW_MINUS : '-';

RULE_SKW_ASSIGN : '=';

RULE_SKW_LEFTPAREN : '(';

RULE_SKW_RIGHTPAREN : ')';

RULE_SKW_COMMA : ',';

RULE_KW_DEFINE : RULE_SKW_MINUS 'D';

RULE_KW_INCDIR : RULE_SKW_MINUS 'I';

RULE_KW_OUTPUT : RULE_SKW_MINUS 'o';

RULE_KW_LANG : RULE_SKW_MINUS 'x';

RULE_KW_NOSTDINC : 'nostdinc';

RULE_KW_INCSYS : 'isystem';

RULE_KW_INCLUDE : 'include';

RULE_ID : RULE_LETTER (RULE_LETTER|'0'..'9')*;

fragment RULE_LETTER : ('$'|'A'..'Z'|'a'..'z'|'_');

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_NEWLINE : ('\n'|'\r');

RULE_WS : (' '|'\t');

RULE_LINE_COMMENT : '//' ( options {greedy=false;} : . )*RULE_NEWLINE;

RULE_ANY_OTHER : .;



