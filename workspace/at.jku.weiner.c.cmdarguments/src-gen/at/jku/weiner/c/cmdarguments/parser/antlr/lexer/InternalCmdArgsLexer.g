
/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
lexer grammar InternalCmdArgsLexer;


@header {
package at.jku.weiner.c.cmdarguments.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}






fragment RULE_SKW_DOT : '.';

fragment RULE_SKW_DIV : '/';

RULE_SKW_COLON : ':';

RULE_SKW_MINUS : '-';

RULE_SKW_ASSIGN : '=';

RULE_SKW_LEFTPAREN : '(';

RULE_SKW_RIGHTPAREN : ')';

RULE_SKW_COMMA : ',';

fragment RULE_SKW_DOLLAR : '$';

RULE_SKW_BACKSLASH : '\\';

RULE_KW_DEFINE : RULE_SKW_MINUS 'D';

RULE_KW_INCDIR : RULE_SKW_MINUS 'I';

RULE_KW_OUTPUT : RULE_SKW_MINUS 'o';

RULE_KW_LANG : RULE_SKW_MINUS 'x';

RULE_KW_NOSTDINC : 'nostdinc';

RULE_KW_INCSYS : 'isystem';

RULE_KW_INCLUDE : 'include';

RULE_KW_VAR : RULE_SKW_DOLLAR RULE_SKW_LEFTPAREN ( options {greedy=false;} : . )*RULE_SKW_RIGHTPAREN;

RULE_ID : RULE_ID_PART_1 RULE_ID_PART_2*;

fragment RULE_ID_PART_1 : (RULE_LETTER|RULE_SKW_DIV|RULE_SKW_DOT|RULE_INT);

fragment RULE_ID_PART_2 : (RULE_ID_PART_1|RULE_SKW_BACKSLASH|RULE_SKW_MINUS);

fragment RULE_LETTER : ('A'..'Z'|'a'..'z'|'_');

RULE_QUOTE1 : '"';

fragment RULE_INT : RULE_DIGIT+;

fragment RULE_DIGIT : '0'..'9';

RULE_NEWLINE : ('\n'|'\r');

RULE_WS : (' '|'\t');

fragment RULE_SKW_HASH1 : '#';

RULE_SKW_HASH2 : RULE_SKW_BACKSLASH RULE_SKW_HASH1;

RULE_LINE_BREAK : RULE_SKW_BACKSLASH RULE_NEWLINE;

RULE_LINE_COMMENT : RULE_SKW_HASH1 ( options {greedy=false;} : . )*RULE_NEWLINE;

RULE_ANY_OTHER : .;



