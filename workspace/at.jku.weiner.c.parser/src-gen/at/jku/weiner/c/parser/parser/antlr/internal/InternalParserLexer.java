package at.jku.weiner.c.parser.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalParserLexer extends Lexer {
    public static final int RULE_ID=41;
    public static final int RULE_KW_CONTINUE=74;
    public static final int RULE_KW_SHORT=25;
    public static final int RULE_KW_THREADLOCAL=12;
    public static final int RULE_KW_DEFAULT=67;
    public static final int RULE_SKW_DOT=79;
    public static final int RULE_KW_CHAR=18;
    public static final int RULE_SKW_PLUS=103;
    public static final int RULE_SKW_GREATEREQUAL=100;
    public static final int EOF=-1;
    public static final int RULE_SKW_LESS=97;
    public static final int RULE_ANDASSIGN=87;
    public static final int RULE_SKW_RIGHTPAREN=36;
    public static final int RULE_KW_FOR=73;
    public static final int RULE_LINEBREAK=143;
    public static final int RULE_SKW_LESSEQUAL=99;
    public static final int RULE_KW_BOOL=16;
    public static final int RULE_UNSIGNED_SUFFIX=147;
    public static final int RULE_KW_UNION=43;
    public static final int RULE_DECIMAL_LITERAL=123;
    public static final int RULE_HEX_LITERAL=121;
    public static final int RULE_KW_ALIGNED2=119;
    public static final int RULE_KW_M128D=27;
    public static final int RULE_KW_ALIGNED3=120;
    public static final int RULE_KW_ATTRIBUTE3=63;
    public static final int RULE_KW_COMPLEX=19;
    public static final int RULE_SKW_AND=94;
    public static final int RULE_KW_ATTRIBUTE2=62;
    public static final int RULE_KW_REGISTER=14;
    public static final int RULE_KW_ALIGNED1=118;
    public static final int RULE_KW_SWITCH=70;
    public static final int RULE_KW_M128I=28;
    public static final int RULE_KW_RESTRICT=47;
    public static final int RULE_WHITESPACE=136;
    public static final int RULE_OCTAL_LITERAL=122;
    public static final int RULE_SKW_COMMA=7;
    public static final int RULE_KW_STATICASSERT=132;
    public static final int RULE_SKW_COLON=44;
    public static final int RULE_BLOCK_COMMENT=159;
    public static final int RULE_BIN_LITERAL=126;
    public static final int RULE_SKW_LEFTPAREN=35;
    public static final int RULE_SKW_MINUS=104;
    public static final int RULE_KW_BUILTIN_OFFSETOF=116;
    public static final int RULE_KW_IF=68;
    public static final int RULE_KW_NORETURN=55;
    public static final int RULE_SKW_EQUAL=95;
    public static final int RULE_SKW_DIV=105;
    public static final int RULE_SKW_ANDAND=92;
    public static final int RULE_HEX_DIGIT=145;
    public static final int RULE_SKW_GREATER=98;
    public static final int RULE_TAB=158;
    public static final int RULE_HEX_ESCAPE=153;
    public static final int RULE_SKW_LEFTBRACKET=56;
    public static final int RULE_KW_STATIC=11;
    public static final int RULE_DIVASSIGN=81;
    public static final int RULE_KW_RETURN=76;
    public static final int RULE_LETTER=141;
    public static final int RULE_KW_TYPEOF2=38;
    public static final int RULE_KW_TYPEOF1=37;
    public static final int RULE_XORASSIGN=88;
    public static final int RULE_KW_TYPEOF3=39;
    public static final int RULE_KW_PRAGMA=131;
    public static final int RULE_KW_VOLATILE=50;
    public static final int RULE_EXPONENT=150;
    public static final int RULE_SPECIAL=163;
    public static final int RULE_KW_EXTERN=10;
    public static final int RULE_KW_VOLATILE2=78;
    public static final int RULE_SKW_UNDERSCORE=127;
    public static final int RULE_LINE_END=156;
    public static final int RULE_STARASSIGN=80;
    public static final int RULE_KW_TYPEDEF=9;
    public static final int RULE_MODASSIGN=82;
    public static final int RULE_KW_ELSE=69;
    public static final int RULE_HEX_PREFIX=144;
    public static final int RULE_PLUSASSIGN=83;
    public static final int RULE_ORASSIGN=89;
    public static final int RULE_IGNORED=162;
    public static final int RULE_KW_ASM3=60;
    public static final int RULE_OCTAL_ESCAPE=152;
    public static final int RULE_KW_ASM1=58;
    public static final int RULE_SKW_NOT=114;
    public static final int RULE_KW_ASM2=59;
    public static final int RULE_LONG_LONG_SUFFIX=149;
    public static final int RULE_ESCAPE_SEQUENCE=142;
    public static final int RULE_SKW_RIGHTSHIFT=102;
    public static final int RULE_KW_AUTO=13;
    public static final int RULE_KW_EXTENSION=34;
    public static final int RULE_SKW_NOTEQUAL=96;
    public static final int RULE_KW_SIZEOF=109;
    public static final int RULE_SKW_RIGHTBRACE=5;
    public static final int RULE_KW_INT128_3=23;
    public static final int RULE_FORM_FEED=161;
    public static final int RULE_LINEDIRECTIVE=135;
    public static final int RULE_KW_BREAK=75;
    public static final int RULE_KW_M128=26;
    public static final int RULE_SKW_STAR=64;
    public static final int RULE_KW_INT=22;
    public static final int RULE_KW_ALIGNAS=128;
    public static final int RULE_KW_GENERIC=129;
    public static final int RULE_STRING_LITERAL=61;
    public static final int RULE_SKW_PLUSPLUS=107;
    public static final int RULE_SKW_DOUBLEQUOTE=138;
    public static final int RULE_KW_RESTRICT3=49;
    public static final int RULE_KW_RESTRICT2=48;
    public static final int RULE_KW_BUILTIN_CHOOSE_EXPR=40;
    public static final int RULE_SKW_OROR=91;
    public static final int RULE_LEFTSHIFTASSIGN=85;
    public static final int RULE_KW_LABEL3=15;
    public static final int RULE_KW_ENUM=45;
    public static final int RULE_KW_VOID=33;
    public static final int RULE_SKW_CARET=65;
    public static final int RULE_KW_CONST=46;
    public static final int RULE_KW_UNSIGNED=32;
    public static final int RULE_KW_FLOAT=21;
    public static final int RULE_SKW_RIGHTBRACKET=57;
    public static final int RULE_SPACE=157;
    public static final int RULE_KW_DO=72;
    public static final int RULE_LINEFEED=154;
    public static final int RULE_SKW_SEMI=6;
    public static final int RULE_NEWLINE=133;
    public static final int RULE_KW_INLINE1=52;
    public static final int RULE_KW_ALIGNOF3=112;
    public static final int RULE_KW_INLINE2=53;
    public static final int RULE_KW_ALIGNOF2=111;
    public static final int RULE_KW_INLINE3=54;
    public static final int RULE_KW_ALIGNOF1=110;
    public static final int RULE_RIGHTSHIFTASSIGN=86;
    public static final int RULE_SKW_DOLLAR=137;
    public static final int RULE_SKW_LEFTSHIFT=101;
    public static final int RULE_SKW_QUESTION=90;
    public static final int RULE_KW_DOUBLE=20;
    public static final int RULE_IDENTIFIER=140;
    public static final int RULE_SKW_SINGLEQUOTE=139;
    public static final int RULE_SKW_MOD=106;
    public static final int RULE_KW_CASE=66;
    public static final int RULE_KW_ATOMIC=51;
    public static final int RULE_SKW_MINUSMINUS=108;
    public static final int RULE_KW_GOTO=77;
    public static final int RULE_FLOAT_TYPE_SUFFIX=151;
    public static final int RULE_INTEGER_TYPE_SUFFIX=146;
    public static final int RULE_MINUSASSIGN=84;
    public static final int RULE_CARRIAGERETURN=155;
    public static final int RULE_SKW_TILDE=113;
    public static final int RULE_ARROW=115;
    public static final int RULE_KW_LONG=24;
    public static final int RULE_LINE_COMMENT=160;
    public static final int RULE_KW_IMAGINARY=130;
    public static final int RULE_KW_BUILTIN_TYPESCOMPATIBLEP=117;
    public static final int RULE_SKW_OR=93;
    public static final int RULE_SKW_BACKSLASH=134;
    public static final int RULE_KW_STRUCT=42;
    public static final int RULE_CHAR_LITERAL=124;
    public static final int RULE_KW_SIGNED1=29;
    public static final int RULE_KW_SIGNED2=30;
    public static final int RULE_KW_SIGNED3=31;
    public static final int RULE_SKW_LEFTBRACE=4;
    public static final int RULE_FLOAT_LITERAL=125;
    public static final int RULE_KW_BUILTIN_VA_LIST=17;
    public static final int RULE_KW_WHILE=71;
    public static final int RULE_SKW_ASSIGN=8;
    public static final int RULE_LONG_SUFFIX=148;

    // delegates
    // delegators

    public InternalParserLexer() {;} 
    public InternalParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalParser.g"; }

    // $ANTLR start "RULE_KW_ATOMIC"
    public final void mRULE_KW_ATOMIC() throws RecognitionException {
        try {
            int _type = RULE_KW_ATOMIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13630:16: ( RULE_SKW_UNDERSCORE 'Atomic' )
            // InternalParser.g:13630:18: RULE_SKW_UNDERSCORE 'Atomic'
            {
            mRULE_SKW_UNDERSCORE(); 
            match("Atomic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ATOMIC"

    // $ANTLR start "RULE_KW_ATTRIBUTE2"
    public final void mRULE_KW_ATTRIBUTE2() throws RecognitionException {
        try {
            int _type = RULE_KW_ATTRIBUTE2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13632:20: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'attribute' )
            // InternalParser.g:13632:22: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'attribute'
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            match("attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ATTRIBUTE2"

    // $ANTLR start "RULE_KW_ATTRIBUTE3"
    public final void mRULE_KW_ATTRIBUTE3() throws RecognitionException {
        try {
            int _type = RULE_KW_ATTRIBUTE3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13634:20: ( RULE_KW_ATTRIBUTE2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE )
            // InternalParser.g:13634:22: RULE_KW_ATTRIBUTE2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE
            {
            mRULE_KW_ATTRIBUTE2(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ATTRIBUTE3"

    // $ANTLR start "RULE_KW_AUTO"
    public final void mRULE_KW_AUTO() throws RecognitionException {
        try {
            int _type = RULE_KW_AUTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13636:14: ( 'auto' )
            // InternalParser.g:13636:16: 'auto'
            {
            match("auto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_AUTO"

    // $ANTLR start "RULE_KW_ALIGNAS"
    public final void mRULE_KW_ALIGNAS() throws RecognitionException {
        try {
            int _type = RULE_KW_ALIGNAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13638:17: ( RULE_SKW_UNDERSCORE 'Alignas' )
            // InternalParser.g:13638:19: RULE_SKW_UNDERSCORE 'Alignas'
            {
            mRULE_SKW_UNDERSCORE(); 
            match("Alignas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ALIGNAS"

    // $ANTLR start "RULE_KW_ALIGNED1"
    public final void mRULE_KW_ALIGNED1() throws RecognitionException {
        try {
            int _type = RULE_KW_ALIGNED1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13640:18: ( 'aligned' )
            // InternalParser.g:13640:20: 'aligned'
            {
            match("aligned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ALIGNED1"

    // $ANTLR start "RULE_KW_ALIGNED2"
    public final void mRULE_KW_ALIGNED2() throws RecognitionException {
        try {
            int _type = RULE_KW_ALIGNED2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13642:18: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_ALIGNED1 )
            // InternalParser.g:13642:20: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_ALIGNED1
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_KW_ALIGNED1(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ALIGNED2"

    // $ANTLR start "RULE_KW_ALIGNED3"
    public final void mRULE_KW_ALIGNED3() throws RecognitionException {
        try {
            int _type = RULE_KW_ALIGNED3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13644:18: ( RULE_KW_ALIGNED2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE )
            // InternalParser.g:13644:20: RULE_KW_ALIGNED2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE
            {
            mRULE_KW_ALIGNED2(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ALIGNED3"

    // $ANTLR start "RULE_KW_ALIGNOF1"
    public final void mRULE_KW_ALIGNOF1() throws RecognitionException {
        try {
            int _type = RULE_KW_ALIGNOF1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13646:18: ( 'alignof' )
            // InternalParser.g:13646:20: 'alignof'
            {
            match("alignof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ALIGNOF1"

    // $ANTLR start "RULE_KW_ALIGNOF2"
    public final void mRULE_KW_ALIGNOF2() throws RecognitionException {
        try {
            int _type = RULE_KW_ALIGNOF2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13648:18: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_ALIGNOF1 )
            // InternalParser.g:13648:20: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_ALIGNOF1
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_KW_ALIGNOF1(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ALIGNOF2"

    // $ANTLR start "RULE_KW_ALIGNOF3"
    public final void mRULE_KW_ALIGNOF3() throws RecognitionException {
        try {
            int _type = RULE_KW_ALIGNOF3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13650:18: ( RULE_KW_ALIGNOF2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE )
            // InternalParser.g:13650:20: RULE_KW_ALIGNOF2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE
            {
            mRULE_KW_ALIGNOF2(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ALIGNOF3"

    // $ANTLR start "RULE_KW_ASM1"
    public final void mRULE_KW_ASM1() throws RecognitionException {
        try {
            int _type = RULE_KW_ASM1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13652:14: ( 'asm' )
            // InternalParser.g:13652:16: 'asm'
            {
            match("asm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ASM1"

    // $ANTLR start "RULE_KW_ASM2"
    public final void mRULE_KW_ASM2() throws RecognitionException {
        try {
            int _type = RULE_KW_ASM2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13654:14: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_ASM1 )
            // InternalParser.g:13654:16: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_ASM1
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_KW_ASM1(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ASM2"

    // $ANTLR start "RULE_KW_ASM3"
    public final void mRULE_KW_ASM3() throws RecognitionException {
        try {
            int _type = RULE_KW_ASM3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13656:14: ( RULE_KW_ASM2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE )
            // InternalParser.g:13656:16: RULE_KW_ASM2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE
            {
            mRULE_KW_ASM2(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ASM3"

    // $ANTLR start "RULE_KW_BOOL"
    public final void mRULE_KW_BOOL() throws RecognitionException {
        try {
            int _type = RULE_KW_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13658:14: ( RULE_SKW_UNDERSCORE 'Bool' )
            // InternalParser.g:13658:16: RULE_SKW_UNDERSCORE 'Bool'
            {
            mRULE_SKW_UNDERSCORE(); 
            match("Bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_BOOL"

    // $ANTLR start "RULE_KW_BREAK"
    public final void mRULE_KW_BREAK() throws RecognitionException {
        try {
            int _type = RULE_KW_BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13660:15: ( 'break' )
            // InternalParser.g:13660:17: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_BREAK"

    // $ANTLR start "RULE_KW_BUILTIN_CHOOSE_EXPR"
    public final void mRULE_KW_BUILTIN_CHOOSE_EXPR() throws RecognitionException {
        try {
            int _type = RULE_KW_BUILTIN_CHOOSE_EXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13662:29: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'builtin_choose_expr' )
            // InternalParser.g:13662:31: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'builtin_choose_expr'
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            match("builtin_choose_expr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_BUILTIN_CHOOSE_EXPR"

    // $ANTLR start "RULE_KW_BUILTIN_VA_LIST"
    public final void mRULE_KW_BUILTIN_VA_LIST() throws RecognitionException {
        try {
            int _type = RULE_KW_BUILTIN_VA_LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13664:25: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'builtin_va_list' )
            // InternalParser.g:13664:27: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'builtin_va_list'
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            match("builtin_va_list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_BUILTIN_VA_LIST"

    // $ANTLR start "RULE_KW_BUILTIN_OFFSETOF"
    public final void mRULE_KW_BUILTIN_OFFSETOF() throws RecognitionException {
        try {
            int _type = RULE_KW_BUILTIN_OFFSETOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13666:26: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'builtin_offsetof' )
            // InternalParser.g:13666:28: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'builtin_offsetof'
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            match("builtin_offsetof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_BUILTIN_OFFSETOF"

    // $ANTLR start "RULE_KW_BUILTIN_TYPESCOMPATIBLEP"
    public final void mRULE_KW_BUILTIN_TYPESCOMPATIBLEP() throws RecognitionException {
        try {
            int _type = RULE_KW_BUILTIN_TYPESCOMPATIBLEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13668:34: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'builtin_types_compatible_p' )
            // InternalParser.g:13668:36: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'builtin_types_compatible_p'
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            match("builtin_types_compatible_p"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_BUILTIN_TYPESCOMPATIBLEP"

    // $ANTLR start "RULE_KW_CASE"
    public final void mRULE_KW_CASE() throws RecognitionException {
        try {
            int _type = RULE_KW_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13670:14: ( 'case' )
            // InternalParser.g:13670:16: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_CASE"

    // $ANTLR start "RULE_KW_CHAR"
    public final void mRULE_KW_CHAR() throws RecognitionException {
        try {
            int _type = RULE_KW_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13672:14: ( 'char' )
            // InternalParser.g:13672:16: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_CHAR"

    // $ANTLR start "RULE_KW_COMPLEX"
    public final void mRULE_KW_COMPLEX() throws RecognitionException {
        try {
            int _type = RULE_KW_COMPLEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13674:17: ( RULE_SKW_UNDERSCORE 'Complex' )
            // InternalParser.g:13674:19: RULE_SKW_UNDERSCORE 'Complex'
            {
            mRULE_SKW_UNDERSCORE(); 
            match("Complex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_COMPLEX"

    // $ANTLR start "RULE_KW_CONST"
    public final void mRULE_KW_CONST() throws RecognitionException {
        try {
            int _type = RULE_KW_CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13676:15: ( 'const' )
            // InternalParser.g:13676:17: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_CONST"

    // $ANTLR start "RULE_KW_CONTINUE"
    public final void mRULE_KW_CONTINUE() throws RecognitionException {
        try {
            int _type = RULE_KW_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13678:18: ( 'continue' )
            // InternalParser.g:13678:20: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_CONTINUE"

    // $ANTLR start "RULE_KW_DEFAULT"
    public final void mRULE_KW_DEFAULT() throws RecognitionException {
        try {
            int _type = RULE_KW_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13680:17: ( 'default' )
            // InternalParser.g:13680:19: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_DEFAULT"

    // $ANTLR start "RULE_KW_DO"
    public final void mRULE_KW_DO() throws RecognitionException {
        try {
            int _type = RULE_KW_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13682:12: ( 'do' )
            // InternalParser.g:13682:14: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_DO"

    // $ANTLR start "RULE_KW_DOUBLE"
    public final void mRULE_KW_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_KW_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13684:16: ( 'double' )
            // InternalParser.g:13684:18: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_DOUBLE"

    // $ANTLR start "RULE_KW_ELSE"
    public final void mRULE_KW_ELSE() throws RecognitionException {
        try {
            int _type = RULE_KW_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13686:14: ( 'else' )
            // InternalParser.g:13686:16: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ELSE"

    // $ANTLR start "RULE_KW_EXTENSION"
    public final void mRULE_KW_EXTENSION() throws RecognitionException {
        try {
            int _type = RULE_KW_EXTENSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13688:19: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'extension' RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE )
            // InternalParser.g:13688:21: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'extension' RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            match("extension"); 

            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_EXTENSION"

    // $ANTLR start "RULE_KW_ENUM"
    public final void mRULE_KW_ENUM() throws RecognitionException {
        try {
            int _type = RULE_KW_ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13690:14: ( 'enum' )
            // InternalParser.g:13690:16: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_ENUM"

    // $ANTLR start "RULE_KW_EXTERN"
    public final void mRULE_KW_EXTERN() throws RecognitionException {
        try {
            int _type = RULE_KW_EXTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13692:16: ( 'extern' )
            // InternalParser.g:13692:18: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_EXTERN"

    // $ANTLR start "RULE_KW_FLOAT"
    public final void mRULE_KW_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_KW_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13694:15: ( 'float' )
            // InternalParser.g:13694:17: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_FLOAT"

    // $ANTLR start "RULE_KW_FOR"
    public final void mRULE_KW_FOR() throws RecognitionException {
        try {
            int _type = RULE_KW_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13696:13: ( 'for' )
            // InternalParser.g:13696:15: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_FOR"

    // $ANTLR start "RULE_KW_GENERIC"
    public final void mRULE_KW_GENERIC() throws RecognitionException {
        try {
            int _type = RULE_KW_GENERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13698:17: ( RULE_SKW_UNDERSCORE 'Generic' )
            // InternalParser.g:13698:19: RULE_SKW_UNDERSCORE 'Generic'
            {
            mRULE_SKW_UNDERSCORE(); 
            match("Generic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_GENERIC"

    // $ANTLR start "RULE_KW_GOTO"
    public final void mRULE_KW_GOTO() throws RecognitionException {
        try {
            int _type = RULE_KW_GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13700:14: ( 'goto' )
            // InternalParser.g:13700:16: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_GOTO"

    // $ANTLR start "RULE_KW_IF"
    public final void mRULE_KW_IF() throws RecognitionException {
        try {
            int _type = RULE_KW_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13702:12: ( 'if' )
            // InternalParser.g:13702:14: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_IF"

    // $ANTLR start "RULE_KW_IMAGINARY"
    public final void mRULE_KW_IMAGINARY() throws RecognitionException {
        try {
            int _type = RULE_KW_IMAGINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13704:19: ( RULE_SKW_UNDERSCORE 'Imaginary' )
            // InternalParser.g:13704:21: RULE_SKW_UNDERSCORE 'Imaginary'
            {
            mRULE_SKW_UNDERSCORE(); 
            match("Imaginary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_IMAGINARY"

    // $ANTLR start "RULE_KW_INLINE1"
    public final void mRULE_KW_INLINE1() throws RecognitionException {
        try {
            int _type = RULE_KW_INLINE1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13706:17: ( 'inline' )
            // InternalParser.g:13706:19: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_INLINE1"

    // $ANTLR start "RULE_KW_INLINE2"
    public final void mRULE_KW_INLINE2() throws RecognitionException {
        try {
            int _type = RULE_KW_INLINE2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13708:17: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_INLINE1 )
            // InternalParser.g:13708:19: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_INLINE1
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_KW_INLINE1(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_INLINE2"

    // $ANTLR start "RULE_KW_INLINE3"
    public final void mRULE_KW_INLINE3() throws RecognitionException {
        try {
            int _type = RULE_KW_INLINE3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13710:17: ( RULE_KW_INLINE2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE )
            // InternalParser.g:13710:19: RULE_KW_INLINE2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE
            {
            mRULE_KW_INLINE2(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_INLINE3"

    // $ANTLR start "RULE_KW_INT"
    public final void mRULE_KW_INT() throws RecognitionException {
        try {
            int _type = RULE_KW_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13712:13: ( 'int' )
            // InternalParser.g:13712:15: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_INT"

    // $ANTLR start "RULE_KW_INT128_3"
    public final void mRULE_KW_INT128_3() throws RecognitionException {
        try {
            int _type = RULE_KW_INT128_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13714:18: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'int128' )
            // InternalParser.g:13714:20: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'int128'
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            match("int128"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_INT128_3"

    // $ANTLR start "RULE_KW_LABEL3"
    public final void mRULE_KW_LABEL3() throws RecognitionException {
        try {
            int _type = RULE_KW_LABEL3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13716:16: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'label' RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE )
            // InternalParser.g:13716:18: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'label' RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            match("label"); 

            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_LABEL3"

    // $ANTLR start "RULE_KW_LONG"
    public final void mRULE_KW_LONG() throws RecognitionException {
        try {
            int _type = RULE_KW_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13718:14: ( 'long' )
            // InternalParser.g:13718:16: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_LONG"

    // $ANTLR start "RULE_KW_M128"
    public final void mRULE_KW_M128() throws RecognitionException {
        try {
            int _type = RULE_KW_M128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13720:14: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'm128' )
            // InternalParser.g:13720:16: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'm128'
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            match("m128"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_M128"

    // $ANTLR start "RULE_KW_M128D"
    public final void mRULE_KW_M128D() throws RecognitionException {
        try {
            int _type = RULE_KW_M128D;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13722:15: ( RULE_KW_M128 'd' )
            // InternalParser.g:13722:17: RULE_KW_M128 'd'
            {
            mRULE_KW_M128(); 
            match('d'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_M128D"

    // $ANTLR start "RULE_KW_M128I"
    public final void mRULE_KW_M128I() throws RecognitionException {
        try {
            int _type = RULE_KW_M128I;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13724:15: ( RULE_KW_M128 'i' )
            // InternalParser.g:13724:17: RULE_KW_M128 'i'
            {
            mRULE_KW_M128(); 
            match('i'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_M128I"

    // $ANTLR start "RULE_KW_NORETURN"
    public final void mRULE_KW_NORETURN() throws RecognitionException {
        try {
            int _type = RULE_KW_NORETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13726:18: ( RULE_SKW_UNDERSCORE 'Noreturn' )
            // InternalParser.g:13726:20: RULE_SKW_UNDERSCORE 'Noreturn'
            {
            mRULE_SKW_UNDERSCORE(); 
            match("Noreturn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_NORETURN"

    // $ANTLR start "RULE_KW_PRAGMA"
    public final void mRULE_KW_PRAGMA() throws RecognitionException {
        try {
            int _type = RULE_KW_PRAGMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13728:16: ( 'pragma' )
            // InternalParser.g:13728:18: 'pragma'
            {
            match("pragma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_PRAGMA"

    // $ANTLR start "RULE_KW_REGISTER"
    public final void mRULE_KW_REGISTER() throws RecognitionException {
        try {
            int _type = RULE_KW_REGISTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13730:18: ( 'register' )
            // InternalParser.g:13730:20: 'register'
            {
            match("register"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_REGISTER"

    // $ANTLR start "RULE_KW_RESTRICT"
    public final void mRULE_KW_RESTRICT() throws RecognitionException {
        try {
            int _type = RULE_KW_RESTRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13732:18: ( 'restrict' )
            // InternalParser.g:13732:20: 'restrict'
            {
            match("restrict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_RESTRICT"

    // $ANTLR start "RULE_KW_RESTRICT2"
    public final void mRULE_KW_RESTRICT2() throws RecognitionException {
        try {
            int _type = RULE_KW_RESTRICT2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13734:19: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_RESTRICT )
            // InternalParser.g:13734:21: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_RESTRICT
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_KW_RESTRICT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_RESTRICT2"

    // $ANTLR start "RULE_KW_RESTRICT3"
    public final void mRULE_KW_RESTRICT3() throws RecognitionException {
        try {
            int _type = RULE_KW_RESTRICT3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13736:19: ( RULE_KW_RESTRICT2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE )
            // InternalParser.g:13736:21: RULE_KW_RESTRICT2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE
            {
            mRULE_KW_RESTRICT2(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_RESTRICT3"

    // $ANTLR start "RULE_KW_RETURN"
    public final void mRULE_KW_RETURN() throws RecognitionException {
        try {
            int _type = RULE_KW_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13738:16: ( 'return' )
            // InternalParser.g:13738:18: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_RETURN"

    // $ANTLR start "RULE_KW_SHORT"
    public final void mRULE_KW_SHORT() throws RecognitionException {
        try {
            int _type = RULE_KW_SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13740:15: ( 'short' )
            // InternalParser.g:13740:17: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_SHORT"

    // $ANTLR start "RULE_KW_SIGNED1"
    public final void mRULE_KW_SIGNED1() throws RecognitionException {
        try {
            int _type = RULE_KW_SIGNED1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13742:17: ( 'signed' )
            // InternalParser.g:13742:19: 'signed'
            {
            match("signed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_SIGNED1"

    // $ANTLR start "RULE_KW_SIGNED2"
    public final void mRULE_KW_SIGNED2() throws RecognitionException {
        try {
            int _type = RULE_KW_SIGNED2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13744:17: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_SIGNED1 )
            // InternalParser.g:13744:19: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_SIGNED1
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_KW_SIGNED1(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_SIGNED2"

    // $ANTLR start "RULE_KW_SIGNED3"
    public final void mRULE_KW_SIGNED3() throws RecognitionException {
        try {
            int _type = RULE_KW_SIGNED3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13746:17: ( RULE_KW_SIGNED2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE )
            // InternalParser.g:13746:19: RULE_KW_SIGNED2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE
            {
            mRULE_KW_SIGNED2(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_SIGNED3"

    // $ANTLR start "RULE_KW_SIZEOF"
    public final void mRULE_KW_SIZEOF() throws RecognitionException {
        try {
            int _type = RULE_KW_SIZEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13748:16: ( 'sizeof' )
            // InternalParser.g:13748:18: 'sizeof'
            {
            match("sizeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_SIZEOF"

    // $ANTLR start "RULE_KW_STATIC"
    public final void mRULE_KW_STATIC() throws RecognitionException {
        try {
            int _type = RULE_KW_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13750:16: ( 'static' )
            // InternalParser.g:13750:18: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_STATIC"

    // $ANTLR start "RULE_KW_STATICASSERT"
    public final void mRULE_KW_STATICASSERT() throws RecognitionException {
        try {
            int _type = RULE_KW_STATICASSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13752:22: ( RULE_SKW_UNDERSCORE 'Static_assert' )
            // InternalParser.g:13752:24: RULE_SKW_UNDERSCORE 'Static_assert'
            {
            mRULE_SKW_UNDERSCORE(); 
            match("Static_assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_STATICASSERT"

    // $ANTLR start "RULE_KW_STRUCT"
    public final void mRULE_KW_STRUCT() throws RecognitionException {
        try {
            int _type = RULE_KW_STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13754:16: ( 'struct' )
            // InternalParser.g:13754:18: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_STRUCT"

    // $ANTLR start "RULE_KW_SWITCH"
    public final void mRULE_KW_SWITCH() throws RecognitionException {
        try {
            int _type = RULE_KW_SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13756:16: ( 'switch' )
            // InternalParser.g:13756:18: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_SWITCH"

    // $ANTLR start "RULE_KW_THREADLOCAL"
    public final void mRULE_KW_THREADLOCAL() throws RecognitionException {
        try {
            int _type = RULE_KW_THREADLOCAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13758:21: ( RULE_SKW_UNDERSCORE 'Thread_local' )
            // InternalParser.g:13758:23: RULE_SKW_UNDERSCORE 'Thread_local'
            {
            mRULE_SKW_UNDERSCORE(); 
            match("Thread_local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_THREADLOCAL"

    // $ANTLR start "RULE_KW_TYPEDEF"
    public final void mRULE_KW_TYPEDEF() throws RecognitionException {
        try {
            int _type = RULE_KW_TYPEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13760:17: ( 'typedef' )
            // InternalParser.g:13760:19: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_TYPEDEF"

    // $ANTLR start "RULE_KW_TYPEOF1"
    public final void mRULE_KW_TYPEOF1() throws RecognitionException {
        try {
            int _type = RULE_KW_TYPEOF1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13762:17: ( 'typeof' )
            // InternalParser.g:13762:19: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_TYPEOF1"

    // $ANTLR start "RULE_KW_TYPEOF2"
    public final void mRULE_KW_TYPEOF2() throws RecognitionException {
        try {
            int _type = RULE_KW_TYPEOF2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13764:17: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_TYPEOF1 )
            // InternalParser.g:13764:19: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_TYPEOF1
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_KW_TYPEOF1(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_TYPEOF2"

    // $ANTLR start "RULE_KW_TYPEOF3"
    public final void mRULE_KW_TYPEOF3() throws RecognitionException {
        try {
            int _type = RULE_KW_TYPEOF3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13766:17: ( RULE_KW_TYPEOF2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE )
            // InternalParser.g:13766:19: RULE_KW_TYPEOF2 RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE
            {
            mRULE_KW_TYPEOF2(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_TYPEOF3"

    // $ANTLR start "RULE_KW_UNION"
    public final void mRULE_KW_UNION() throws RecognitionException {
        try {
            int _type = RULE_KW_UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13768:15: ( 'union' )
            // InternalParser.g:13768:17: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_UNION"

    // $ANTLR start "RULE_KW_UNSIGNED"
    public final void mRULE_KW_UNSIGNED() throws RecognitionException {
        try {
            int _type = RULE_KW_UNSIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13770:18: ( 'unsigned' )
            // InternalParser.g:13770:20: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_UNSIGNED"

    // $ANTLR start "RULE_KW_VOID"
    public final void mRULE_KW_VOID() throws RecognitionException {
        try {
            int _type = RULE_KW_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13772:14: ( 'void' )
            // InternalParser.g:13772:16: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_VOID"

    // $ANTLR start "RULE_KW_VOLATILE"
    public final void mRULE_KW_VOLATILE() throws RecognitionException {
        try {
            int _type = RULE_KW_VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13774:18: ( 'volatile' )
            // InternalParser.g:13774:20: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_VOLATILE"

    // $ANTLR start "RULE_KW_VOLATILE2"
    public final void mRULE_KW_VOLATILE2() throws RecognitionException {
        try {
            int _type = RULE_KW_VOLATILE2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13776:19: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_VOLATILE RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE )
            // InternalParser.g:13776:21: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE RULE_KW_VOLATILE RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_KW_VOLATILE(); 
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_VOLATILE2"

    // $ANTLR start "RULE_KW_WHILE"
    public final void mRULE_KW_WHILE() throws RecognitionException {
        try {
            int _type = RULE_KW_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13778:15: ( 'while' )
            // InternalParser.g:13778:17: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_WHILE"

    // $ANTLR start "RULE_STARASSIGN"
    public final void mRULE_STARASSIGN() throws RecognitionException {
        try {
            int _type = RULE_STARASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13780:17: ( RULE_SKW_STAR RULE_SKW_ASSIGN )
            // InternalParser.g:13780:19: RULE_SKW_STAR RULE_SKW_ASSIGN
            {
            mRULE_SKW_STAR(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STARASSIGN"

    // $ANTLR start "RULE_DIVASSIGN"
    public final void mRULE_DIVASSIGN() throws RecognitionException {
        try {
            int _type = RULE_DIVASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13782:16: ( RULE_SKW_DIV RULE_SKW_ASSIGN )
            // InternalParser.g:13782:18: RULE_SKW_DIV RULE_SKW_ASSIGN
            {
            mRULE_SKW_DIV(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIVASSIGN"

    // $ANTLR start "RULE_MODASSIGN"
    public final void mRULE_MODASSIGN() throws RecognitionException {
        try {
            int _type = RULE_MODASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13784:16: ( RULE_SKW_MOD RULE_SKW_ASSIGN )
            // InternalParser.g:13784:18: RULE_SKW_MOD RULE_SKW_ASSIGN
            {
            mRULE_SKW_MOD(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODASSIGN"

    // $ANTLR start "RULE_PLUSASSIGN"
    public final void mRULE_PLUSASSIGN() throws RecognitionException {
        try {
            int _type = RULE_PLUSASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13786:17: ( RULE_SKW_PLUS RULE_SKW_ASSIGN )
            // InternalParser.g:13786:19: RULE_SKW_PLUS RULE_SKW_ASSIGN
            {
            mRULE_SKW_PLUS(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUSASSIGN"

    // $ANTLR start "RULE_MINUSASSIGN"
    public final void mRULE_MINUSASSIGN() throws RecognitionException {
        try {
            int _type = RULE_MINUSASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13788:18: ( RULE_SKW_MINUS RULE_SKW_ASSIGN )
            // InternalParser.g:13788:20: RULE_SKW_MINUS RULE_SKW_ASSIGN
            {
            mRULE_SKW_MINUS(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUSASSIGN"

    // $ANTLR start "RULE_LEFTSHIFTASSIGN"
    public final void mRULE_LEFTSHIFTASSIGN() throws RecognitionException {
        try {
            int _type = RULE_LEFTSHIFTASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13790:22: ( RULE_SKW_LEFTSHIFT RULE_SKW_ASSIGN )
            // InternalParser.g:13790:24: RULE_SKW_LEFTSHIFT RULE_SKW_ASSIGN
            {
            mRULE_SKW_LEFTSHIFT(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFTSHIFTASSIGN"

    // $ANTLR start "RULE_RIGHTSHIFTASSIGN"
    public final void mRULE_RIGHTSHIFTASSIGN() throws RecognitionException {
        try {
            int _type = RULE_RIGHTSHIFTASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13792:23: ( RULE_SKW_RIGHTSHIFT RULE_SKW_ASSIGN )
            // InternalParser.g:13792:25: RULE_SKW_RIGHTSHIFT RULE_SKW_ASSIGN
            {
            mRULE_SKW_RIGHTSHIFT(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHTSHIFTASSIGN"

    // $ANTLR start "RULE_ANDASSIGN"
    public final void mRULE_ANDASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ANDASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13794:16: ( RULE_SKW_AND RULE_SKW_ASSIGN )
            // InternalParser.g:13794:18: RULE_SKW_AND RULE_SKW_ASSIGN
            {
            mRULE_SKW_AND(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANDASSIGN"

    // $ANTLR start "RULE_XORASSIGN"
    public final void mRULE_XORASSIGN() throws RecognitionException {
        try {
            int _type = RULE_XORASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13796:16: ( RULE_SKW_CARET RULE_SKW_ASSIGN )
            // InternalParser.g:13796:18: RULE_SKW_CARET RULE_SKW_ASSIGN
            {
            mRULE_SKW_CARET(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XORASSIGN"

    // $ANTLR start "RULE_ORASSIGN"
    public final void mRULE_ORASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ORASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13798:15: ( RULE_SKW_OR RULE_SKW_ASSIGN )
            // InternalParser.g:13798:17: RULE_SKW_OR RULE_SKW_ASSIGN
            {
            mRULE_SKW_OR(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ORASSIGN"

    // $ANTLR start "RULE_ARROW"
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13800:12: ( RULE_SKW_MINUS RULE_SKW_GREATER )
            // InternalParser.g:13800:14: RULE_SKW_MINUS RULE_SKW_GREATER
            {
            mRULE_SKW_MINUS(); 
            mRULE_SKW_GREATER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARROW"

    // $ANTLR start "RULE_LINEDIRECTIVE"
    public final void mRULE_LINEDIRECTIVE() throws RecognitionException {
        try {
            int _type = RULE_LINEDIRECTIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13802:20: ( '#' (~ ( RULE_NEWLINE ) | RULE_SKW_BACKSLASH RULE_NEWLINE )* )
            // InternalParser.g:13802:22: '#' (~ ( RULE_NEWLINE ) | RULE_SKW_BACKSLASH RULE_NEWLINE )*
            {
            match('#'); 
            // InternalParser.g:13802:26: (~ ( RULE_NEWLINE ) | RULE_SKW_BACKSLASH RULE_NEWLINE )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2=='\n'||LA1_2=='\r') ) {
                        alt1=2;
                    }

                    else {
                        alt1=1;
                    }

                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalParser.g:13802:27: ~ ( RULE_NEWLINE )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalParser.g:13802:43: RULE_SKW_BACKSLASH RULE_NEWLINE
            	    {
            	    mRULE_SKW_BACKSLASH(); 
            	    mRULE_NEWLINE(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINEDIRECTIVE"

    // $ANTLR start "RULE_WHITESPACE"
    public final void mRULE_WHITESPACE() throws RecognitionException {
        try {
            int _type = RULE_WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13804:17: ( ( ' ' | '\\t' )+ )
            // InternalParser.g:13804:19: ( ' ' | '\\t' )+
            {
            // InternalParser.g:13804:19: ( ' ' | '\\t' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalParser.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHITESPACE"

    // $ANTLR start "RULE_SKW_AND"
    public final void mRULE_SKW_AND() throws RecognitionException {
        try {
            int _type = RULE_SKW_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13806:14: ( '&' )
            // InternalParser.g:13806:16: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_AND"

    // $ANTLR start "RULE_SKW_ANDAND"
    public final void mRULE_SKW_ANDAND() throws RecognitionException {
        try {
            int _type = RULE_SKW_ANDAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13808:17: ( RULE_SKW_AND RULE_SKW_AND )
            // InternalParser.g:13808:19: RULE_SKW_AND RULE_SKW_AND
            {
            mRULE_SKW_AND(); 
            mRULE_SKW_AND(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_ANDAND"

    // $ANTLR start "RULE_SKW_ASSIGN"
    public final void mRULE_SKW_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_SKW_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13810:17: ( '=' )
            // InternalParser.g:13810:19: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_ASSIGN"

    // $ANTLR start "RULE_SKW_BACKSLASH"
    public final void mRULE_SKW_BACKSLASH() throws RecognitionException {
        try {
            int _type = RULE_SKW_BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13812:20: ( '\\\\' )
            // InternalParser.g:13812:22: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_BACKSLASH"

    // $ANTLR start "RULE_SKW_CARET"
    public final void mRULE_SKW_CARET() throws RecognitionException {
        try {
            int _type = RULE_SKW_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13814:16: ( '^' )
            // InternalParser.g:13814:18: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_CARET"

    // $ANTLR start "RULE_SKW_COMMA"
    public final void mRULE_SKW_COMMA() throws RecognitionException {
        try {
            int _type = RULE_SKW_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13816:16: ( ',' )
            // InternalParser.g:13816:18: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_COMMA"

    // $ANTLR start "RULE_SKW_COLON"
    public final void mRULE_SKW_COLON() throws RecognitionException {
        try {
            int _type = RULE_SKW_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13818:16: ( ':' )
            // InternalParser.g:13818:18: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_COLON"

    // $ANTLR start "RULE_SKW_DIV"
    public final void mRULE_SKW_DIV() throws RecognitionException {
        try {
            int _type = RULE_SKW_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13820:14: ( '/' )
            // InternalParser.g:13820:16: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_DIV"

    // $ANTLR start "RULE_SKW_DOLLAR"
    public final void mRULE_SKW_DOLLAR() throws RecognitionException {
        try {
            // InternalParser.g:13822:26: ( '$' )
            // InternalParser.g:13822:28: '$'
            {
            match('$'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_DOLLAR"

    // $ANTLR start "RULE_SKW_DOT"
    public final void mRULE_SKW_DOT() throws RecognitionException {
        try {
            int _type = RULE_SKW_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13824:14: ( '.' )
            // InternalParser.g:13824:16: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_DOT"

    // $ANTLR start "RULE_SKW_DOUBLEQUOTE"
    public final void mRULE_SKW_DOUBLEQUOTE() throws RecognitionException {
        try {
            int _type = RULE_SKW_DOUBLEQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13826:22: ( '\"' )
            // InternalParser.g:13826:24: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_DOUBLEQUOTE"

    // $ANTLR start "RULE_SKW_EQUAL"
    public final void mRULE_SKW_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_SKW_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13828:16: ( RULE_SKW_ASSIGN RULE_SKW_ASSIGN )
            // InternalParser.g:13828:18: RULE_SKW_ASSIGN RULE_SKW_ASSIGN
            {
            mRULE_SKW_ASSIGN(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_EQUAL"

    // $ANTLR start "RULE_SKW_GREATER"
    public final void mRULE_SKW_GREATER() throws RecognitionException {
        try {
            int _type = RULE_SKW_GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13830:18: ( '>' )
            // InternalParser.g:13830:20: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_GREATER"

    // $ANTLR start "RULE_SKW_GREATEREQUAL"
    public final void mRULE_SKW_GREATEREQUAL() throws RecognitionException {
        try {
            int _type = RULE_SKW_GREATEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13832:23: ( RULE_SKW_GREATER RULE_SKW_ASSIGN )
            // InternalParser.g:13832:25: RULE_SKW_GREATER RULE_SKW_ASSIGN
            {
            mRULE_SKW_GREATER(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_GREATEREQUAL"

    // $ANTLR start "RULE_SKW_LEFTBRACE"
    public final void mRULE_SKW_LEFTBRACE() throws RecognitionException {
        try {
            int _type = RULE_SKW_LEFTBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13834:20: ( '{' )
            // InternalParser.g:13834:22: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_LEFTBRACE"

    // $ANTLR start "RULE_SKW_LEFTBRACKET"
    public final void mRULE_SKW_LEFTBRACKET() throws RecognitionException {
        try {
            int _type = RULE_SKW_LEFTBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13836:22: ( '[' )
            // InternalParser.g:13836:24: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_LEFTBRACKET"

    // $ANTLR start "RULE_SKW_LEFTPAREN"
    public final void mRULE_SKW_LEFTPAREN() throws RecognitionException {
        try {
            int _type = RULE_SKW_LEFTPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13838:20: ( '(' )
            // InternalParser.g:13838:22: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_LEFTPAREN"

    // $ANTLR start "RULE_SKW_LEFTSHIFT"
    public final void mRULE_SKW_LEFTSHIFT() throws RecognitionException {
        try {
            int _type = RULE_SKW_LEFTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13840:20: ( RULE_SKW_LESS RULE_SKW_LESS )
            // InternalParser.g:13840:22: RULE_SKW_LESS RULE_SKW_LESS
            {
            mRULE_SKW_LESS(); 
            mRULE_SKW_LESS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_LEFTSHIFT"

    // $ANTLR start "RULE_SKW_LESS"
    public final void mRULE_SKW_LESS() throws RecognitionException {
        try {
            int _type = RULE_SKW_LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13842:15: ( '<' )
            // InternalParser.g:13842:17: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_LESS"

    // $ANTLR start "RULE_SKW_LESSEQUAL"
    public final void mRULE_SKW_LESSEQUAL() throws RecognitionException {
        try {
            int _type = RULE_SKW_LESSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13844:20: ( RULE_SKW_LESS RULE_SKW_ASSIGN )
            // InternalParser.g:13844:22: RULE_SKW_LESS RULE_SKW_ASSIGN
            {
            mRULE_SKW_LESS(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_LESSEQUAL"

    // $ANTLR start "RULE_SKW_MINUS"
    public final void mRULE_SKW_MINUS() throws RecognitionException {
        try {
            int _type = RULE_SKW_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13846:16: ( '-' )
            // InternalParser.g:13846:18: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_MINUS"

    // $ANTLR start "RULE_SKW_MINUSMINUS"
    public final void mRULE_SKW_MINUSMINUS() throws RecognitionException {
        try {
            int _type = RULE_SKW_MINUSMINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13848:21: ( RULE_SKW_MINUS RULE_SKW_MINUS )
            // InternalParser.g:13848:23: RULE_SKW_MINUS RULE_SKW_MINUS
            {
            mRULE_SKW_MINUS(); 
            mRULE_SKW_MINUS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_MINUSMINUS"

    // $ANTLR start "RULE_SKW_MOD"
    public final void mRULE_SKW_MOD() throws RecognitionException {
        try {
            int _type = RULE_SKW_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13850:14: ( '%' )
            // InternalParser.g:13850:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_MOD"

    // $ANTLR start "RULE_SKW_NOT"
    public final void mRULE_SKW_NOT() throws RecognitionException {
        try {
            int _type = RULE_SKW_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13852:14: ( '!' )
            // InternalParser.g:13852:16: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_NOT"

    // $ANTLR start "RULE_SKW_NOTEQUAL"
    public final void mRULE_SKW_NOTEQUAL() throws RecognitionException {
        try {
            int _type = RULE_SKW_NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13854:19: ( RULE_SKW_NOT RULE_SKW_ASSIGN )
            // InternalParser.g:13854:21: RULE_SKW_NOT RULE_SKW_ASSIGN
            {
            mRULE_SKW_NOT(); 
            mRULE_SKW_ASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_NOTEQUAL"

    // $ANTLR start "RULE_SKW_OR"
    public final void mRULE_SKW_OR() throws RecognitionException {
        try {
            int _type = RULE_SKW_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13856:13: ( '|' )
            // InternalParser.g:13856:15: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_OR"

    // $ANTLR start "RULE_SKW_OROR"
    public final void mRULE_SKW_OROR() throws RecognitionException {
        try {
            int _type = RULE_SKW_OROR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13858:15: ( RULE_SKW_OR RULE_SKW_OR )
            // InternalParser.g:13858:17: RULE_SKW_OR RULE_SKW_OR
            {
            mRULE_SKW_OR(); 
            mRULE_SKW_OR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_OROR"

    // $ANTLR start "RULE_SKW_PLUS"
    public final void mRULE_SKW_PLUS() throws RecognitionException {
        try {
            int _type = RULE_SKW_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13860:15: ( '+' )
            // InternalParser.g:13860:17: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_PLUS"

    // $ANTLR start "RULE_SKW_PLUSPLUS"
    public final void mRULE_SKW_PLUSPLUS() throws RecognitionException {
        try {
            int _type = RULE_SKW_PLUSPLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13862:19: ( RULE_SKW_PLUS RULE_SKW_PLUS )
            // InternalParser.g:13862:21: RULE_SKW_PLUS RULE_SKW_PLUS
            {
            mRULE_SKW_PLUS(); 
            mRULE_SKW_PLUS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_PLUSPLUS"

    // $ANTLR start "RULE_SKW_QUESTION"
    public final void mRULE_SKW_QUESTION() throws RecognitionException {
        try {
            int _type = RULE_SKW_QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13864:19: ( '?' )
            // InternalParser.g:13864:21: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_QUESTION"

    // $ANTLR start "RULE_SKW_RIGHTBRACE"
    public final void mRULE_SKW_RIGHTBRACE() throws RecognitionException {
        try {
            int _type = RULE_SKW_RIGHTBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13866:21: ( '}' )
            // InternalParser.g:13866:23: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_RIGHTBRACE"

    // $ANTLR start "RULE_SKW_RIGHTBRACKET"
    public final void mRULE_SKW_RIGHTBRACKET() throws RecognitionException {
        try {
            int _type = RULE_SKW_RIGHTBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13868:23: ( ']' )
            // InternalParser.g:13868:25: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_RIGHTBRACKET"

    // $ANTLR start "RULE_SKW_RIGHTPAREN"
    public final void mRULE_SKW_RIGHTPAREN() throws RecognitionException {
        try {
            int _type = RULE_SKW_RIGHTPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13870:21: ( ')' )
            // InternalParser.g:13870:23: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_RIGHTPAREN"

    // $ANTLR start "RULE_SKW_RIGHTSHIFT"
    public final void mRULE_SKW_RIGHTSHIFT() throws RecognitionException {
        try {
            int _type = RULE_SKW_RIGHTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13872:21: ( RULE_SKW_GREATER RULE_SKW_GREATER )
            // InternalParser.g:13872:23: RULE_SKW_GREATER RULE_SKW_GREATER
            {
            mRULE_SKW_GREATER(); 
            mRULE_SKW_GREATER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_RIGHTSHIFT"

    // $ANTLR start "RULE_SKW_SEMI"
    public final void mRULE_SKW_SEMI() throws RecognitionException {
        try {
            int _type = RULE_SKW_SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13874:15: ( ';' )
            // InternalParser.g:13874:17: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_SEMI"

    // $ANTLR start "RULE_SKW_SINGLEQUOTE"
    public final void mRULE_SKW_SINGLEQUOTE() throws RecognitionException {
        try {
            int _type = RULE_SKW_SINGLEQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13876:22: ( '\\'' )
            // InternalParser.g:13876:24: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_SINGLEQUOTE"

    // $ANTLR start "RULE_SKW_STAR"
    public final void mRULE_SKW_STAR() throws RecognitionException {
        try {
            int _type = RULE_SKW_STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13878:15: ( '*' )
            // InternalParser.g:13878:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_STAR"

    // $ANTLR start "RULE_SKW_TILDE"
    public final void mRULE_SKW_TILDE() throws RecognitionException {
        try {
            int _type = RULE_SKW_TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13880:16: ( '~' )
            // InternalParser.g:13880:18: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_TILDE"

    // $ANTLR start "RULE_SKW_UNDERSCORE"
    public final void mRULE_SKW_UNDERSCORE() throws RecognitionException {
        try {
            // InternalParser.g:13882:30: ( '_' )
            // InternalParser.g:13882:32: '_'
            {
            match('_'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SKW_UNDERSCORE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13884:9: ( RULE_IDENTIFIER )
            // InternalParser.g:13884:11: RULE_IDENTIFIER
            {
            mRULE_IDENTIFIER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            // InternalParser.g:13886:26: ( RULE_LETTER ( RULE_LETTER | '0' .. '9' )* )
            // InternalParser.g:13886:28: RULE_LETTER ( RULE_LETTER | '0' .. '9' )*
            {
            mRULE_LETTER(); 
            // InternalParser.g:13886:40: ( RULE_LETTER | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='$'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalParser.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalParser.g:13888:22: ( ( RULE_SKW_DOLLAR | 'A' .. 'Z' | 'a' .. 'z' | RULE_SKW_UNDERSCORE ) )
            // InternalParser.g:13888:24: ( RULE_SKW_DOLLAR | 'A' .. 'Z' | 'a' .. 'z' | RULE_SKW_UNDERSCORE )
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_CHAR_LITERAL"
    public final void mRULE_CHAR_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_CHAR_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13890:19: ( ( 'L' )? RULE_SKW_SINGLEQUOTE ( RULE_ESCAPE_SEQUENCE | ~ ( ( RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) ) | RULE_LINEBREAK ) RULE_SKW_SINGLEQUOTE )
            // InternalParser.g:13890:21: ( 'L' )? RULE_SKW_SINGLEQUOTE ( RULE_ESCAPE_SEQUENCE | ~ ( ( RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) ) | RULE_LINEBREAK ) RULE_SKW_SINGLEQUOTE
            {
            // InternalParser.g:13890:21: ( 'L' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='L') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalParser.g:13890:21: 'L'
                    {
                    match('L'); 

                    }
                    break;

            }

            mRULE_SKW_SINGLEQUOTE(); 
            // InternalParser.g:13890:47: ( RULE_ESCAPE_SEQUENCE | ~ ( ( RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) ) | RULE_LINEBREAK )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\\') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='\n'||LA5_1=='\r') ) {
                    alt5=3;
                }
                else if ( (LA5_1=='\"'||LA5_1=='\''||(LA5_1>='0' && LA5_1<='7')||LA5_1=='\\'||LA5_1=='b'||LA5_1=='f'||LA5_1=='n'||LA5_1=='r'||LA5_1=='t'||LA5_1=='x') ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalParser.g:13890:48: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 2 :
                    // InternalParser.g:13890:69: ~ ( ( RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // InternalParser.g:13890:114: RULE_LINEBREAK
                    {
                    mRULE_LINEBREAK(); 

                    }
                    break;

            }

            mRULE_SKW_SINGLEQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR_LITERAL"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13892:21: ( RULE_SKW_DOUBLEQUOTE ( RULE_ESCAPE_SEQUENCE | ~ ( ( RULE_SKW_BACKSLASH | RULE_SKW_DOUBLEQUOTE ) ) | RULE_LINEBREAK )* RULE_SKW_DOUBLEQUOTE )
            // InternalParser.g:13892:23: RULE_SKW_DOUBLEQUOTE ( RULE_ESCAPE_SEQUENCE | ~ ( ( RULE_SKW_BACKSLASH | RULE_SKW_DOUBLEQUOTE ) ) | RULE_LINEBREAK )* RULE_SKW_DOUBLEQUOTE
            {
            mRULE_SKW_DOUBLEQUOTE(); 
            // InternalParser.g:13892:44: ( RULE_ESCAPE_SEQUENCE | ~ ( ( RULE_SKW_BACKSLASH | RULE_SKW_DOUBLEQUOTE ) ) | RULE_LINEBREAK )*
            loop6:
            do {
                int alt6=4;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2=='\"'||LA6_2=='\''||(LA6_2>='0' && LA6_2<='7')||LA6_2=='\\'||LA6_2=='b'||LA6_2=='f'||LA6_2=='n'||LA6_2=='r'||LA6_2=='t'||LA6_2=='x') ) {
                        alt6=1;
                    }
                    else if ( (LA6_2=='\n'||LA6_2=='\r') ) {
                        alt6=3;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalParser.g:13892:45: RULE_ESCAPE_SEQUENCE
            	    {
            	    mRULE_ESCAPE_SEQUENCE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalParser.g:13892:66: ~ ( ( RULE_SKW_BACKSLASH | RULE_SKW_DOUBLEQUOTE ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 3 :
            	    // InternalParser.g:13892:111: RULE_LINEBREAK
            	    {
            	    mRULE_LINEBREAK(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            mRULE_SKW_DOUBLEQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL"

    // $ANTLR start "RULE_HEX_LITERAL"
    public final void mRULE_HEX_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_HEX_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13894:18: ( RULE_HEX_PREFIX ( RULE_HEX_DIGIT )+ ( RULE_INTEGER_TYPE_SUFFIX )? )
            // InternalParser.g:13894:20: RULE_HEX_PREFIX ( RULE_HEX_DIGIT )+ ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            mRULE_HEX_PREFIX(); 
            // InternalParser.g:13894:36: ( RULE_HEX_DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalParser.g:13894:36: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // InternalParser.g:13894:52: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='L'||LA8_0=='U'||LA8_0=='l'||LA8_0=='u') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalParser.g:13894:52: RULE_INTEGER_TYPE_SUFFIX
                    {
                    mRULE_INTEGER_TYPE_SUFFIX(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_LITERAL"

    // $ANTLR start "RULE_HEX_PREFIX"
    public final void mRULE_HEX_PREFIX() throws RecognitionException {
        try {
            // InternalParser.g:13896:26: ( ( '0x' | '0X' ) )
            // InternalParser.g:13896:28: ( '0x' | '0X' )
            {
            // InternalParser.g:13896:28: ( '0x' | '0X' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='0') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='x') ) {
                    alt9=1;
                }
                else if ( (LA9_1=='X') ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalParser.g:13896:29: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalParser.g:13896:34: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_PREFIX"

    // $ANTLR start "RULE_DECIMAL_LITERAL"
    public final void mRULE_DECIMAL_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13898:22: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( RULE_INTEGER_TYPE_SUFFIX )? )
            // InternalParser.g:13898:24: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            // InternalParser.g:13898:24: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='0') ) {
                alt11=1;
            }
            else if ( ((LA11_0>='1' && LA11_0<='9')) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalParser.g:13898:25: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalParser.g:13898:29: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalParser.g:13898:38: ( '0' .. '9' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalParser.g:13898:39: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalParser.g:13898:51: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='L'||LA12_0=='U'||LA12_0=='l'||LA12_0=='u') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalParser.g:13898:51: RULE_INTEGER_TYPE_SUFFIX
                    {
                    mRULE_INTEGER_TYPE_SUFFIX(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_LITERAL"

    // $ANTLR start "RULE_OCTAL_LITERAL"
    public final void mRULE_OCTAL_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_OCTAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13900:20: ( '0' ( '0' .. '7' )+ ( RULE_INTEGER_TYPE_SUFFIX )? )
            // InternalParser.g:13900:22: '0' ( '0' .. '7' )+ ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            match('0'); 
            // InternalParser.g:13900:26: ( '0' .. '7' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='7')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalParser.g:13900:27: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            // InternalParser.g:13900:38: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='L'||LA14_0=='U'||LA14_0=='l'||LA14_0=='u') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalParser.g:13900:38: RULE_INTEGER_TYPE_SUFFIX
                    {
                    mRULE_INTEGER_TYPE_SUFFIX(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_LITERAL"

    // $ANTLR start "RULE_BIN_LITERAL"
    public final void mRULE_BIN_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BIN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13902:18: ( ( '0b' | '0B' ) ( '0' .. '1' )+ )
            // InternalParser.g:13902:20: ( '0b' | '0B' ) ( '0' .. '1' )+
            {
            // InternalParser.g:13902:20: ( '0b' | '0B' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='0') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='b') ) {
                    alt15=1;
                }
                else if ( (LA15_1=='B') ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalParser.g:13902:21: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalParser.g:13902:26: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalParser.g:13902:32: ( '0' .. '1' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='1')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalParser.g:13902:33: '0' .. '1'
            	    {
            	    matchRange('0','1'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIN_LITERAL"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalParser.g:13904:25: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalParser.g:13904:27: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_INTEGER_TYPE_SUFFIX"
    public final void mRULE_INTEGER_TYPE_SUFFIX() throws RecognitionException {
        try {
            // InternalParser.g:13906:35: ( ( RULE_UNSIGNED_SUFFIX ( RULE_LONG_SUFFIX )? | RULE_UNSIGNED_SUFFIX RULE_LONG_LONG_SUFFIX | RULE_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? | RULE_LONG_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? ) )
            // InternalParser.g:13906:37: ( RULE_UNSIGNED_SUFFIX ( RULE_LONG_SUFFIX )? | RULE_UNSIGNED_SUFFIX RULE_LONG_LONG_SUFFIX | RULE_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? | RULE_LONG_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? )
            {
            // InternalParser.g:13906:37: ( RULE_UNSIGNED_SUFFIX ( RULE_LONG_SUFFIX )? | RULE_UNSIGNED_SUFFIX RULE_LONG_LONG_SUFFIX | RULE_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? | RULE_LONG_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? )
            int alt20=4;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalParser.g:13906:38: RULE_UNSIGNED_SUFFIX ( RULE_LONG_SUFFIX )?
                    {
                    mRULE_UNSIGNED_SUFFIX(); 
                    // InternalParser.g:13906:59: ( RULE_LONG_SUFFIX )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='L'||LA17_0=='l') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalParser.g:13906:59: RULE_LONG_SUFFIX
                            {
                            mRULE_LONG_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:13906:77: RULE_UNSIGNED_SUFFIX RULE_LONG_LONG_SUFFIX
                    {
                    mRULE_UNSIGNED_SUFFIX(); 
                    mRULE_LONG_LONG_SUFFIX(); 

                    }
                    break;
                case 3 :
                    // InternalParser.g:13906:120: RULE_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )?
                    {
                    mRULE_LONG_SUFFIX(); 
                    // InternalParser.g:13906:137: ( RULE_UNSIGNED_SUFFIX )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='U'||LA18_0=='u') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalParser.g:13906:137: RULE_UNSIGNED_SUFFIX
                            {
                            mRULE_UNSIGNED_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalParser.g:13906:159: RULE_LONG_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )?
                    {
                    mRULE_LONG_LONG_SUFFIX(); 
                    // InternalParser.g:13906:181: ( RULE_UNSIGNED_SUFFIX )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='U'||LA19_0=='u') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalParser.g:13906:181: RULE_UNSIGNED_SUFFIX
                            {
                            mRULE_UNSIGNED_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_TYPE_SUFFIX"

    // $ANTLR start "RULE_UNSIGNED_SUFFIX"
    public final void mRULE_UNSIGNED_SUFFIX() throws RecognitionException {
        try {
            // InternalParser.g:13908:31: ( ( 'u' | 'U' ) )
            // InternalParser.g:13908:33: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_SUFFIX"

    // $ANTLR start "RULE_LONG_SUFFIX"
    public final void mRULE_LONG_SUFFIX() throws RecognitionException {
        try {
            // InternalParser.g:13910:27: ( ( 'l' | 'L' ) )
            // InternalParser.g:13910:29: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG_SUFFIX"

    // $ANTLR start "RULE_LONG_LONG_SUFFIX"
    public final void mRULE_LONG_LONG_SUFFIX() throws RecognitionException {
        try {
            // InternalParser.g:13912:32: ( ( 'll' | 'LL' ) )
            // InternalParser.g:13912:34: ( 'll' | 'LL' )
            {
            // InternalParser.g:13912:34: ( 'll' | 'LL' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='l') ) {
                alt21=1;
            }
            else if ( (LA21_0=='L') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalParser.g:13912:35: 'll'
                    {
                    match("ll"); 


                    }
                    break;
                case 2 :
                    // InternalParser.g:13912:40: 'LL'
                    {
                    match("LL"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG_LONG_SUFFIX"

    // $ANTLR start "RULE_FLOAT_LITERAL"
    public final void mRULE_FLOAT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13914:20: ( ( ( '0' .. '9' )+ RULE_SKW_DOT ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | RULE_SKW_DOT ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ ( RULE_EXPONENT )? RULE_FLOAT_TYPE_SUFFIX ) )
            // InternalParser.g:13914:22: ( ( '0' .. '9' )+ RULE_SKW_DOT ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | RULE_SKW_DOT ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ ( RULE_EXPONENT )? RULE_FLOAT_TYPE_SUFFIX )
            {
            // InternalParser.g:13914:22: ( ( '0' .. '9' )+ RULE_SKW_DOT ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | RULE_SKW_DOT ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ ( RULE_EXPONENT )? RULE_FLOAT_TYPE_SUFFIX )
            int alt33=4;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalParser.g:13914:23: ( '0' .. '9' )+ RULE_SKW_DOT ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    // InternalParser.g:13914:23: ( '0' .. '9' )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalParser.g:13914:24: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    mRULE_SKW_DOT(); 
                    // InternalParser.g:13914:48: ( '0' .. '9' )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalParser.g:13914:49: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // InternalParser.g:13914:60: ( RULE_EXPONENT )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='E'||LA24_0=='e') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalParser.g:13914:60: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    // InternalParser.g:13914:75: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='D'||LA25_0=='F'||LA25_0=='d'||LA25_0=='f') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalParser.g:13914:75: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalParser.g:13914:99: RULE_SKW_DOT ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    mRULE_SKW_DOT(); 
                    // InternalParser.g:13914:112: ( '0' .. '9' )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalParser.g:13914:113: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    // InternalParser.g:13914:124: ( RULE_EXPONENT )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='E'||LA27_0=='e') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalParser.g:13914:124: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    // InternalParser.g:13914:139: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='D'||LA28_0=='F'||LA28_0=='d'||LA28_0=='f') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalParser.g:13914:139: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalParser.g:13914:163: ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    // InternalParser.g:13914:163: ( '0' .. '9' )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>='0' && LA29_0<='9')) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalParser.g:13914:164: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);

                    mRULE_EXPONENT(); 
                    // InternalParser.g:13914:189: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='D'||LA30_0=='F'||LA30_0=='d'||LA30_0=='f') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalParser.g:13914:189: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalParser.g:13914:213: ( '0' .. '9' )+ ( RULE_EXPONENT )? RULE_FLOAT_TYPE_SUFFIX
                    {
                    // InternalParser.g:13914:213: ( '0' .. '9' )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>='0' && LA31_0<='9')) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalParser.g:13914:214: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    // InternalParser.g:13914:225: ( RULE_EXPONENT )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0=='E'||LA32_0=='e') ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalParser.g:13914:225: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    mRULE_FLOAT_TYPE_SUFFIX(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_LITERAL"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalParser.g:13916:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // InternalParser.g:13916:26: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalParser.g:13916:36: ( '+' | '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='+'||LA34_0=='-') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalParser.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalParser.g:13916:47: ( '0' .. '9' )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='0' && LA35_0<='9')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalParser.g:13916:48: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_FLOAT_TYPE_SUFFIX"
    public final void mRULE_FLOAT_TYPE_SUFFIX() throws RecognitionException {
        try {
            // InternalParser.g:13918:33: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // InternalParser.g:13918:35: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_TYPE_SUFFIX"

    // $ANTLR start "RULE_ESCAPE_SEQUENCE"
    public final void mRULE_ESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // InternalParser.g:13920:31: ( ( RULE_SKW_BACKSLASH ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) | RULE_OCTAL_ESCAPE | RULE_HEX_ESCAPE ) )
            // InternalParser.g:13920:33: ( RULE_SKW_BACKSLASH ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) | RULE_OCTAL_ESCAPE | RULE_HEX_ESCAPE )
            {
            // InternalParser.g:13920:33: ( RULE_SKW_BACKSLASH ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) | RULE_OCTAL_ESCAPE | RULE_HEX_ESCAPE )
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt36=2;
                    }
                    break;
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt36=1;
                    }
                    break;
                case 'x':
                    {
                    alt36=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalParser.g:13920:34: RULE_SKW_BACKSLASH ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH )
                    {
                    mRULE_SKW_BACKSLASH(); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalParser.g:13920:119: RULE_OCTAL_ESCAPE
                    {
                    mRULE_OCTAL_ESCAPE(); 

                    }
                    break;
                case 3 :
                    // InternalParser.g:13920:137: RULE_HEX_ESCAPE
                    {
                    mRULE_HEX_ESCAPE(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPE_SEQUENCE"

    // $ANTLR start "RULE_OCTAL_ESCAPE"
    public final void mRULE_OCTAL_ESCAPE() throws RecognitionException {
        try {
            // InternalParser.g:13922:28: ( ( RULE_SKW_BACKSLASH '0' .. '3' '0' .. '7' '0' .. '7' | RULE_SKW_BACKSLASH '0' .. '7' '0' .. '7' | RULE_SKW_BACKSLASH '0' .. '7' ) )
            // InternalParser.g:13922:30: ( RULE_SKW_BACKSLASH '0' .. '3' '0' .. '7' '0' .. '7' | RULE_SKW_BACKSLASH '0' .. '7' '0' .. '7' | RULE_SKW_BACKSLASH '0' .. '7' )
            {
            // InternalParser.g:13922:30: ( RULE_SKW_BACKSLASH '0' .. '3' '0' .. '7' '0' .. '7' | RULE_SKW_BACKSLASH '0' .. '7' '0' .. '7' | RULE_SKW_BACKSLASH '0' .. '7' )
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='\\') ) {
                int LA37_1 = input.LA(2);

                if ( ((LA37_1>='0' && LA37_1<='3')) ) {
                    int LA37_2 = input.LA(3);

                    if ( ((LA37_2>='0' && LA37_2<='7')) ) {
                        int LA37_4 = input.LA(4);

                        if ( ((LA37_4>='0' && LA37_4<='7')) ) {
                            alt37=1;
                        }
                        else {
                            alt37=2;}
                    }
                    else {
                        alt37=3;}
                }
                else if ( ((LA37_1>='4' && LA37_1<='7')) ) {
                    int LA37_3 = input.LA(3);

                    if ( ((LA37_3>='0' && LA37_3<='7')) ) {
                        alt37=2;
                    }
                    else {
                        alt37=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalParser.g:13922:31: RULE_SKW_BACKSLASH '0' .. '3' '0' .. '7' '0' .. '7'
                    {
                    mRULE_SKW_BACKSLASH(); 
                    matchRange('0','3'); 
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 2 :
                    // InternalParser.g:13922:77: RULE_SKW_BACKSLASH '0' .. '7' '0' .. '7'
                    {
                    mRULE_SKW_BACKSLASH(); 
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 3 :
                    // InternalParser.g:13922:114: RULE_SKW_BACKSLASH '0' .. '7'
                    {
                    mRULE_SKW_BACKSLASH(); 
                    matchRange('0','7'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_ESCAPE"

    // $ANTLR start "RULE_HEX_ESCAPE"
    public final void mRULE_HEX_ESCAPE() throws RecognitionException {
        try {
            // InternalParser.g:13924:26: ( RULE_SKW_BACKSLASH 'x' ( RULE_HEX_DIGIT )+ )
            // InternalParser.g:13924:28: RULE_SKW_BACKSLASH 'x' ( RULE_HEX_DIGIT )+
            {
            mRULE_SKW_BACKSLASH(); 
            match('x'); 
            // InternalParser.g:13924:51: ( RULE_HEX_DIGIT )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>='0' && LA38_0<='9')||(LA38_0>='A' && LA38_0<='F')||(LA38_0>='a' && LA38_0<='f')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalParser.g:13924:51: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_ESCAPE"

    // $ANTLR start "RULE_LINEFEED"
    public final void mRULE_LINEFEED() throws RecognitionException {
        try {
            // InternalParser.g:13926:24: ( '\\n' )
            // InternalParser.g:13926:26: '\\n'
            {
            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINEFEED"

    // $ANTLR start "RULE_CARRIAGERETURN"
    public final void mRULE_CARRIAGERETURN() throws RecognitionException {
        try {
            // InternalParser.g:13928:30: ( '\\r' )
            // InternalParser.g:13928:32: '\\r'
            {
            match('\r'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CARRIAGERETURN"

    // $ANTLR start "RULE_LINE_END"
    public final void mRULE_LINE_END() throws RecognitionException {
        try {
            // InternalParser.g:13930:24: ( ( RULE_CARRIAGERETURN | RULE_LINEFEED ) )
            // InternalParser.g:13930:26: ( RULE_CARRIAGERETURN | RULE_LINEFEED )
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINE_END"

    // $ANTLR start "RULE_LINEBREAK"
    public final void mRULE_LINEBREAK() throws RecognitionException {
        try {
            // InternalParser.g:13932:25: ( RULE_SKW_BACKSLASH RULE_LINE_END )
            // InternalParser.g:13932:27: RULE_SKW_BACKSLASH RULE_LINE_END
            {
            mRULE_SKW_BACKSLASH(); 
            mRULE_LINE_END(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINEBREAK"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13934:14: ( RULE_LINE_END )
            // InternalParser.g:13934:16: RULE_LINE_END
            {
            mRULE_LINE_END(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            // InternalParser.g:13936:21: ( ' ' )
            // InternalParser.g:13936:23: ' '
            {
            match(' '); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_TAB"
    public final void mRULE_TAB() throws RecognitionException {
        try {
            // InternalParser.g:13938:19: ( '\\t' )
            // InternalParser.g:13938:21: '\\t'
            {
            match('\t'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAB"

    // $ANTLR start "RULE_BLOCK_COMMENT"
    public final void mRULE_BLOCK_COMMENT() throws RecognitionException {
        try {
            // InternalParser.g:13940:29: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalParser.g:13940:31: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalParser.g:13940:36: ( options {greedy=false; } : . )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0=='*') ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1=='/') ) {
                        alt39=2;
                    }
                    else if ( ((LA39_1>='\u0000' && LA39_1<='.')||(LA39_1>='0' && LA39_1<='\uFFFF')) ) {
                        alt39=1;
                    }


                }
                else if ( ((LA39_0>='\u0000' && LA39_0<=')')||(LA39_0>='+' && LA39_0<='\uFFFF')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalParser.g:13940:64: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            match("*/"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BLOCK_COMMENT"

    // $ANTLR start "RULE_LINE_COMMENT"
    public final void mRULE_LINE_COMMENT() throws RecognitionException {
        try {
            // InternalParser.g:13942:28: ( '//' (~ ( RULE_LINE_END ) )* )
            // InternalParser.g:13942:30: '//' (~ ( RULE_LINE_END ) )*
            {
            match("//"); 

            // InternalParser.g:13942:35: (~ ( RULE_LINE_END ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>='\u0000' && LA40_0<='\t')||(LA40_0>='\u000B' && LA40_0<='\f')||(LA40_0>='\u000E' && LA40_0<='\uFFFF')) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalParser.g:13942:35: ~ ( RULE_LINE_END )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINE_COMMENT"

    // $ANTLR start "RULE_FORM_FEED"
    public final void mRULE_FORM_FEED() throws RecognitionException {
        try {
            // InternalParser.g:13944:25: ( '\\f' )
            // InternalParser.g:13944:27: '\\f'
            {
            match('\f'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FORM_FEED"

    // $ANTLR start "RULE_IGNORED"
    public final void mRULE_IGNORED() throws RecognitionException {
        try {
            int _type = RULE_IGNORED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13946:14: ( ( RULE_LINEBREAK | RULE_BLOCK_COMMENT | RULE_LINE_COMMENT | RULE_FORM_FEED ) )
            // InternalParser.g:13946:16: ( RULE_LINEBREAK | RULE_BLOCK_COMMENT | RULE_LINE_COMMENT | RULE_FORM_FEED )
            {
            // InternalParser.g:13946:16: ( RULE_LINEBREAK | RULE_BLOCK_COMMENT | RULE_LINE_COMMENT | RULE_FORM_FEED )
            int alt41=4;
            switch ( input.LA(1) ) {
            case '\\':
                {
                alt41=1;
                }
                break;
            case '/':
                {
                int LA41_2 = input.LA(2);

                if ( (LA41_2=='*') ) {
                    alt41=2;
                }
                else if ( (LA41_2=='/') ) {
                    alt41=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
                }
                break;
            case '\f':
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalParser.g:13946:17: RULE_LINEBREAK
                    {
                    mRULE_LINEBREAK(); 

                    }
                    break;
                case 2 :
                    // InternalParser.g:13946:32: RULE_BLOCK_COMMENT
                    {
                    mRULE_BLOCK_COMMENT(); 

                    }
                    break;
                case 3 :
                    // InternalParser.g:13946:51: RULE_LINE_COMMENT
                    {
                    mRULE_LINE_COMMENT(); 

                    }
                    break;
                case 4 :
                    // InternalParser.g:13946:69: RULE_FORM_FEED
                    {
                    mRULE_FORM_FEED(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IGNORED"

    // $ANTLR start "RULE_SPECIAL"
    public final void mRULE_SPECIAL() throws RecognitionException {
        try {
            int _type = RULE_SPECIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalParser.g:13948:14: ( . )
            // InternalParser.g:13948:16: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPECIAL"

    public void mTokens() throws RecognitionException {
        // InternalParser.g:1:8: ( RULE_KW_ATOMIC | RULE_KW_ATTRIBUTE2 | RULE_KW_ATTRIBUTE3 | RULE_KW_AUTO | RULE_KW_ALIGNAS | RULE_KW_ALIGNED1 | RULE_KW_ALIGNED2 | RULE_KW_ALIGNED3 | RULE_KW_ALIGNOF1 | RULE_KW_ALIGNOF2 | RULE_KW_ALIGNOF3 | RULE_KW_ASM1 | RULE_KW_ASM2 | RULE_KW_ASM3 | RULE_KW_BOOL | RULE_KW_BREAK | RULE_KW_BUILTIN_CHOOSE_EXPR | RULE_KW_BUILTIN_VA_LIST | RULE_KW_BUILTIN_OFFSETOF | RULE_KW_BUILTIN_TYPESCOMPATIBLEP | RULE_KW_CASE | RULE_KW_CHAR | RULE_KW_COMPLEX | RULE_KW_CONST | RULE_KW_CONTINUE | RULE_KW_DEFAULT | RULE_KW_DO | RULE_KW_DOUBLE | RULE_KW_ELSE | RULE_KW_EXTENSION | RULE_KW_ENUM | RULE_KW_EXTERN | RULE_KW_FLOAT | RULE_KW_FOR | RULE_KW_GENERIC | RULE_KW_GOTO | RULE_KW_IF | RULE_KW_IMAGINARY | RULE_KW_INLINE1 | RULE_KW_INLINE2 | RULE_KW_INLINE3 | RULE_KW_INT | RULE_KW_INT128_3 | RULE_KW_LABEL3 | RULE_KW_LONG | RULE_KW_M128 | RULE_KW_M128D | RULE_KW_M128I | RULE_KW_NORETURN | RULE_KW_PRAGMA | RULE_KW_REGISTER | RULE_KW_RESTRICT | RULE_KW_RESTRICT2 | RULE_KW_RESTRICT3 | RULE_KW_RETURN | RULE_KW_SHORT | RULE_KW_SIGNED1 | RULE_KW_SIGNED2 | RULE_KW_SIGNED3 | RULE_KW_SIZEOF | RULE_KW_STATIC | RULE_KW_STATICASSERT | RULE_KW_STRUCT | RULE_KW_SWITCH | RULE_KW_THREADLOCAL | RULE_KW_TYPEDEF | RULE_KW_TYPEOF1 | RULE_KW_TYPEOF2 | RULE_KW_TYPEOF3 | RULE_KW_UNION | RULE_KW_UNSIGNED | RULE_KW_VOID | RULE_KW_VOLATILE | RULE_KW_VOLATILE2 | RULE_KW_WHILE | RULE_STARASSIGN | RULE_DIVASSIGN | RULE_MODASSIGN | RULE_PLUSASSIGN | RULE_MINUSASSIGN | RULE_LEFTSHIFTASSIGN | RULE_RIGHTSHIFTASSIGN | RULE_ANDASSIGN | RULE_XORASSIGN | RULE_ORASSIGN | RULE_ARROW | RULE_LINEDIRECTIVE | RULE_WHITESPACE | RULE_SKW_AND | RULE_SKW_ANDAND | RULE_SKW_ASSIGN | RULE_SKW_BACKSLASH | RULE_SKW_CARET | RULE_SKW_COMMA | RULE_SKW_COLON | RULE_SKW_DIV | RULE_SKW_DOT | RULE_SKW_DOUBLEQUOTE | RULE_SKW_EQUAL | RULE_SKW_GREATER | RULE_SKW_GREATEREQUAL | RULE_SKW_LEFTBRACE | RULE_SKW_LEFTBRACKET | RULE_SKW_LEFTPAREN | RULE_SKW_LEFTSHIFT | RULE_SKW_LESS | RULE_SKW_LESSEQUAL | RULE_SKW_MINUS | RULE_SKW_MINUSMINUS | RULE_SKW_MOD | RULE_SKW_NOT | RULE_SKW_NOTEQUAL | RULE_SKW_OR | RULE_SKW_OROR | RULE_SKW_PLUS | RULE_SKW_PLUSPLUS | RULE_SKW_QUESTION | RULE_SKW_RIGHTBRACE | RULE_SKW_RIGHTBRACKET | RULE_SKW_RIGHTPAREN | RULE_SKW_RIGHTSHIFT | RULE_SKW_SEMI | RULE_SKW_SINGLEQUOTE | RULE_SKW_STAR | RULE_SKW_TILDE | RULE_ID | RULE_CHAR_LITERAL | RULE_STRING_LITERAL | RULE_HEX_LITERAL | RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_BIN_LITERAL | RULE_FLOAT_LITERAL | RULE_NEWLINE | RULE_IGNORED | RULE_SPECIAL )
        int alt42=136;
        alt42 = dfa42.predict(input);
        switch (alt42) {
            case 1 :
                // InternalParser.g:1:10: RULE_KW_ATOMIC
                {
                mRULE_KW_ATOMIC(); 

                }
                break;
            case 2 :
                // InternalParser.g:1:25: RULE_KW_ATTRIBUTE2
                {
                mRULE_KW_ATTRIBUTE2(); 

                }
                break;
            case 3 :
                // InternalParser.g:1:44: RULE_KW_ATTRIBUTE3
                {
                mRULE_KW_ATTRIBUTE3(); 

                }
                break;
            case 4 :
                // InternalParser.g:1:63: RULE_KW_AUTO
                {
                mRULE_KW_AUTO(); 

                }
                break;
            case 5 :
                // InternalParser.g:1:76: RULE_KW_ALIGNAS
                {
                mRULE_KW_ALIGNAS(); 

                }
                break;
            case 6 :
                // InternalParser.g:1:92: RULE_KW_ALIGNED1
                {
                mRULE_KW_ALIGNED1(); 

                }
                break;
            case 7 :
                // InternalParser.g:1:109: RULE_KW_ALIGNED2
                {
                mRULE_KW_ALIGNED2(); 

                }
                break;
            case 8 :
                // InternalParser.g:1:126: RULE_KW_ALIGNED3
                {
                mRULE_KW_ALIGNED3(); 

                }
                break;
            case 9 :
                // InternalParser.g:1:143: RULE_KW_ALIGNOF1
                {
                mRULE_KW_ALIGNOF1(); 

                }
                break;
            case 10 :
                // InternalParser.g:1:160: RULE_KW_ALIGNOF2
                {
                mRULE_KW_ALIGNOF2(); 

                }
                break;
            case 11 :
                // InternalParser.g:1:177: RULE_KW_ALIGNOF3
                {
                mRULE_KW_ALIGNOF3(); 

                }
                break;
            case 12 :
                // InternalParser.g:1:194: RULE_KW_ASM1
                {
                mRULE_KW_ASM1(); 

                }
                break;
            case 13 :
                // InternalParser.g:1:207: RULE_KW_ASM2
                {
                mRULE_KW_ASM2(); 

                }
                break;
            case 14 :
                // InternalParser.g:1:220: RULE_KW_ASM3
                {
                mRULE_KW_ASM3(); 

                }
                break;
            case 15 :
                // InternalParser.g:1:233: RULE_KW_BOOL
                {
                mRULE_KW_BOOL(); 

                }
                break;
            case 16 :
                // InternalParser.g:1:246: RULE_KW_BREAK
                {
                mRULE_KW_BREAK(); 

                }
                break;
            case 17 :
                // InternalParser.g:1:260: RULE_KW_BUILTIN_CHOOSE_EXPR
                {
                mRULE_KW_BUILTIN_CHOOSE_EXPR(); 

                }
                break;
            case 18 :
                // InternalParser.g:1:288: RULE_KW_BUILTIN_VA_LIST
                {
                mRULE_KW_BUILTIN_VA_LIST(); 

                }
                break;
            case 19 :
                // InternalParser.g:1:312: RULE_KW_BUILTIN_OFFSETOF
                {
                mRULE_KW_BUILTIN_OFFSETOF(); 

                }
                break;
            case 20 :
                // InternalParser.g:1:337: RULE_KW_BUILTIN_TYPESCOMPATIBLEP
                {
                mRULE_KW_BUILTIN_TYPESCOMPATIBLEP(); 

                }
                break;
            case 21 :
                // InternalParser.g:1:370: RULE_KW_CASE
                {
                mRULE_KW_CASE(); 

                }
                break;
            case 22 :
                // InternalParser.g:1:383: RULE_KW_CHAR
                {
                mRULE_KW_CHAR(); 

                }
                break;
            case 23 :
                // InternalParser.g:1:396: RULE_KW_COMPLEX
                {
                mRULE_KW_COMPLEX(); 

                }
                break;
            case 24 :
                // InternalParser.g:1:412: RULE_KW_CONST
                {
                mRULE_KW_CONST(); 

                }
                break;
            case 25 :
                // InternalParser.g:1:426: RULE_KW_CONTINUE
                {
                mRULE_KW_CONTINUE(); 

                }
                break;
            case 26 :
                // InternalParser.g:1:443: RULE_KW_DEFAULT
                {
                mRULE_KW_DEFAULT(); 

                }
                break;
            case 27 :
                // InternalParser.g:1:459: RULE_KW_DO
                {
                mRULE_KW_DO(); 

                }
                break;
            case 28 :
                // InternalParser.g:1:470: RULE_KW_DOUBLE
                {
                mRULE_KW_DOUBLE(); 

                }
                break;
            case 29 :
                // InternalParser.g:1:485: RULE_KW_ELSE
                {
                mRULE_KW_ELSE(); 

                }
                break;
            case 30 :
                // InternalParser.g:1:498: RULE_KW_EXTENSION
                {
                mRULE_KW_EXTENSION(); 

                }
                break;
            case 31 :
                // InternalParser.g:1:516: RULE_KW_ENUM
                {
                mRULE_KW_ENUM(); 

                }
                break;
            case 32 :
                // InternalParser.g:1:529: RULE_KW_EXTERN
                {
                mRULE_KW_EXTERN(); 

                }
                break;
            case 33 :
                // InternalParser.g:1:544: RULE_KW_FLOAT
                {
                mRULE_KW_FLOAT(); 

                }
                break;
            case 34 :
                // InternalParser.g:1:558: RULE_KW_FOR
                {
                mRULE_KW_FOR(); 

                }
                break;
            case 35 :
                // InternalParser.g:1:570: RULE_KW_GENERIC
                {
                mRULE_KW_GENERIC(); 

                }
                break;
            case 36 :
                // InternalParser.g:1:586: RULE_KW_GOTO
                {
                mRULE_KW_GOTO(); 

                }
                break;
            case 37 :
                // InternalParser.g:1:599: RULE_KW_IF
                {
                mRULE_KW_IF(); 

                }
                break;
            case 38 :
                // InternalParser.g:1:610: RULE_KW_IMAGINARY
                {
                mRULE_KW_IMAGINARY(); 

                }
                break;
            case 39 :
                // InternalParser.g:1:628: RULE_KW_INLINE1
                {
                mRULE_KW_INLINE1(); 

                }
                break;
            case 40 :
                // InternalParser.g:1:644: RULE_KW_INLINE2
                {
                mRULE_KW_INLINE2(); 

                }
                break;
            case 41 :
                // InternalParser.g:1:660: RULE_KW_INLINE3
                {
                mRULE_KW_INLINE3(); 

                }
                break;
            case 42 :
                // InternalParser.g:1:676: RULE_KW_INT
                {
                mRULE_KW_INT(); 

                }
                break;
            case 43 :
                // InternalParser.g:1:688: RULE_KW_INT128_3
                {
                mRULE_KW_INT128_3(); 

                }
                break;
            case 44 :
                // InternalParser.g:1:705: RULE_KW_LABEL3
                {
                mRULE_KW_LABEL3(); 

                }
                break;
            case 45 :
                // InternalParser.g:1:720: RULE_KW_LONG
                {
                mRULE_KW_LONG(); 

                }
                break;
            case 46 :
                // InternalParser.g:1:733: RULE_KW_M128
                {
                mRULE_KW_M128(); 

                }
                break;
            case 47 :
                // InternalParser.g:1:746: RULE_KW_M128D
                {
                mRULE_KW_M128D(); 

                }
                break;
            case 48 :
                // InternalParser.g:1:760: RULE_KW_M128I
                {
                mRULE_KW_M128I(); 

                }
                break;
            case 49 :
                // InternalParser.g:1:774: RULE_KW_NORETURN
                {
                mRULE_KW_NORETURN(); 

                }
                break;
            case 50 :
                // InternalParser.g:1:791: RULE_KW_PRAGMA
                {
                mRULE_KW_PRAGMA(); 

                }
                break;
            case 51 :
                // InternalParser.g:1:806: RULE_KW_REGISTER
                {
                mRULE_KW_REGISTER(); 

                }
                break;
            case 52 :
                // InternalParser.g:1:823: RULE_KW_RESTRICT
                {
                mRULE_KW_RESTRICT(); 

                }
                break;
            case 53 :
                // InternalParser.g:1:840: RULE_KW_RESTRICT2
                {
                mRULE_KW_RESTRICT2(); 

                }
                break;
            case 54 :
                // InternalParser.g:1:858: RULE_KW_RESTRICT3
                {
                mRULE_KW_RESTRICT3(); 

                }
                break;
            case 55 :
                // InternalParser.g:1:876: RULE_KW_RETURN
                {
                mRULE_KW_RETURN(); 

                }
                break;
            case 56 :
                // InternalParser.g:1:891: RULE_KW_SHORT
                {
                mRULE_KW_SHORT(); 

                }
                break;
            case 57 :
                // InternalParser.g:1:905: RULE_KW_SIGNED1
                {
                mRULE_KW_SIGNED1(); 

                }
                break;
            case 58 :
                // InternalParser.g:1:921: RULE_KW_SIGNED2
                {
                mRULE_KW_SIGNED2(); 

                }
                break;
            case 59 :
                // InternalParser.g:1:937: RULE_KW_SIGNED3
                {
                mRULE_KW_SIGNED3(); 

                }
                break;
            case 60 :
                // InternalParser.g:1:953: RULE_KW_SIZEOF
                {
                mRULE_KW_SIZEOF(); 

                }
                break;
            case 61 :
                // InternalParser.g:1:968: RULE_KW_STATIC
                {
                mRULE_KW_STATIC(); 

                }
                break;
            case 62 :
                // InternalParser.g:1:983: RULE_KW_STATICASSERT
                {
                mRULE_KW_STATICASSERT(); 

                }
                break;
            case 63 :
                // InternalParser.g:1:1004: RULE_KW_STRUCT
                {
                mRULE_KW_STRUCT(); 

                }
                break;
            case 64 :
                // InternalParser.g:1:1019: RULE_KW_SWITCH
                {
                mRULE_KW_SWITCH(); 

                }
                break;
            case 65 :
                // InternalParser.g:1:1034: RULE_KW_THREADLOCAL
                {
                mRULE_KW_THREADLOCAL(); 

                }
                break;
            case 66 :
                // InternalParser.g:1:1054: RULE_KW_TYPEDEF
                {
                mRULE_KW_TYPEDEF(); 

                }
                break;
            case 67 :
                // InternalParser.g:1:1070: RULE_KW_TYPEOF1
                {
                mRULE_KW_TYPEOF1(); 

                }
                break;
            case 68 :
                // InternalParser.g:1:1086: RULE_KW_TYPEOF2
                {
                mRULE_KW_TYPEOF2(); 

                }
                break;
            case 69 :
                // InternalParser.g:1:1102: RULE_KW_TYPEOF3
                {
                mRULE_KW_TYPEOF3(); 

                }
                break;
            case 70 :
                // InternalParser.g:1:1118: RULE_KW_UNION
                {
                mRULE_KW_UNION(); 

                }
                break;
            case 71 :
                // InternalParser.g:1:1132: RULE_KW_UNSIGNED
                {
                mRULE_KW_UNSIGNED(); 

                }
                break;
            case 72 :
                // InternalParser.g:1:1149: RULE_KW_VOID
                {
                mRULE_KW_VOID(); 

                }
                break;
            case 73 :
                // InternalParser.g:1:1162: RULE_KW_VOLATILE
                {
                mRULE_KW_VOLATILE(); 

                }
                break;
            case 74 :
                // InternalParser.g:1:1179: RULE_KW_VOLATILE2
                {
                mRULE_KW_VOLATILE2(); 

                }
                break;
            case 75 :
                // InternalParser.g:1:1197: RULE_KW_WHILE
                {
                mRULE_KW_WHILE(); 

                }
                break;
            case 76 :
                // InternalParser.g:1:1211: RULE_STARASSIGN
                {
                mRULE_STARASSIGN(); 

                }
                break;
            case 77 :
                // InternalParser.g:1:1227: RULE_DIVASSIGN
                {
                mRULE_DIVASSIGN(); 

                }
                break;
            case 78 :
                // InternalParser.g:1:1242: RULE_MODASSIGN
                {
                mRULE_MODASSIGN(); 

                }
                break;
            case 79 :
                // InternalParser.g:1:1257: RULE_PLUSASSIGN
                {
                mRULE_PLUSASSIGN(); 

                }
                break;
            case 80 :
                // InternalParser.g:1:1273: RULE_MINUSASSIGN
                {
                mRULE_MINUSASSIGN(); 

                }
                break;
            case 81 :
                // InternalParser.g:1:1290: RULE_LEFTSHIFTASSIGN
                {
                mRULE_LEFTSHIFTASSIGN(); 

                }
                break;
            case 82 :
                // InternalParser.g:1:1311: RULE_RIGHTSHIFTASSIGN
                {
                mRULE_RIGHTSHIFTASSIGN(); 

                }
                break;
            case 83 :
                // InternalParser.g:1:1333: RULE_ANDASSIGN
                {
                mRULE_ANDASSIGN(); 

                }
                break;
            case 84 :
                // InternalParser.g:1:1348: RULE_XORASSIGN
                {
                mRULE_XORASSIGN(); 

                }
                break;
            case 85 :
                // InternalParser.g:1:1363: RULE_ORASSIGN
                {
                mRULE_ORASSIGN(); 

                }
                break;
            case 86 :
                // InternalParser.g:1:1377: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 87 :
                // InternalParser.g:1:1388: RULE_LINEDIRECTIVE
                {
                mRULE_LINEDIRECTIVE(); 

                }
                break;
            case 88 :
                // InternalParser.g:1:1407: RULE_WHITESPACE
                {
                mRULE_WHITESPACE(); 

                }
                break;
            case 89 :
                // InternalParser.g:1:1423: RULE_SKW_AND
                {
                mRULE_SKW_AND(); 

                }
                break;
            case 90 :
                // InternalParser.g:1:1436: RULE_SKW_ANDAND
                {
                mRULE_SKW_ANDAND(); 

                }
                break;
            case 91 :
                // InternalParser.g:1:1452: RULE_SKW_ASSIGN
                {
                mRULE_SKW_ASSIGN(); 

                }
                break;
            case 92 :
                // InternalParser.g:1:1468: RULE_SKW_BACKSLASH
                {
                mRULE_SKW_BACKSLASH(); 

                }
                break;
            case 93 :
                // InternalParser.g:1:1487: RULE_SKW_CARET
                {
                mRULE_SKW_CARET(); 

                }
                break;
            case 94 :
                // InternalParser.g:1:1502: RULE_SKW_COMMA
                {
                mRULE_SKW_COMMA(); 

                }
                break;
            case 95 :
                // InternalParser.g:1:1517: RULE_SKW_COLON
                {
                mRULE_SKW_COLON(); 

                }
                break;
            case 96 :
                // InternalParser.g:1:1532: RULE_SKW_DIV
                {
                mRULE_SKW_DIV(); 

                }
                break;
            case 97 :
                // InternalParser.g:1:1545: RULE_SKW_DOT
                {
                mRULE_SKW_DOT(); 

                }
                break;
            case 98 :
                // InternalParser.g:1:1558: RULE_SKW_DOUBLEQUOTE
                {
                mRULE_SKW_DOUBLEQUOTE(); 

                }
                break;
            case 99 :
                // InternalParser.g:1:1579: RULE_SKW_EQUAL
                {
                mRULE_SKW_EQUAL(); 

                }
                break;
            case 100 :
                // InternalParser.g:1:1594: RULE_SKW_GREATER
                {
                mRULE_SKW_GREATER(); 

                }
                break;
            case 101 :
                // InternalParser.g:1:1611: RULE_SKW_GREATEREQUAL
                {
                mRULE_SKW_GREATEREQUAL(); 

                }
                break;
            case 102 :
                // InternalParser.g:1:1633: RULE_SKW_LEFTBRACE
                {
                mRULE_SKW_LEFTBRACE(); 

                }
                break;
            case 103 :
                // InternalParser.g:1:1652: RULE_SKW_LEFTBRACKET
                {
                mRULE_SKW_LEFTBRACKET(); 

                }
                break;
            case 104 :
                // InternalParser.g:1:1673: RULE_SKW_LEFTPAREN
                {
                mRULE_SKW_LEFTPAREN(); 

                }
                break;
            case 105 :
                // InternalParser.g:1:1692: RULE_SKW_LEFTSHIFT
                {
                mRULE_SKW_LEFTSHIFT(); 

                }
                break;
            case 106 :
                // InternalParser.g:1:1711: RULE_SKW_LESS
                {
                mRULE_SKW_LESS(); 

                }
                break;
            case 107 :
                // InternalParser.g:1:1725: RULE_SKW_LESSEQUAL
                {
                mRULE_SKW_LESSEQUAL(); 

                }
                break;
            case 108 :
                // InternalParser.g:1:1744: RULE_SKW_MINUS
                {
                mRULE_SKW_MINUS(); 

                }
                break;
            case 109 :
                // InternalParser.g:1:1759: RULE_SKW_MINUSMINUS
                {
                mRULE_SKW_MINUSMINUS(); 

                }
                break;
            case 110 :
                // InternalParser.g:1:1779: RULE_SKW_MOD
                {
                mRULE_SKW_MOD(); 

                }
                break;
            case 111 :
                // InternalParser.g:1:1792: RULE_SKW_NOT
                {
                mRULE_SKW_NOT(); 

                }
                break;
            case 112 :
                // InternalParser.g:1:1805: RULE_SKW_NOTEQUAL
                {
                mRULE_SKW_NOTEQUAL(); 

                }
                break;
            case 113 :
                // InternalParser.g:1:1823: RULE_SKW_OR
                {
                mRULE_SKW_OR(); 

                }
                break;
            case 114 :
                // InternalParser.g:1:1835: RULE_SKW_OROR
                {
                mRULE_SKW_OROR(); 

                }
                break;
            case 115 :
                // InternalParser.g:1:1849: RULE_SKW_PLUS
                {
                mRULE_SKW_PLUS(); 

                }
                break;
            case 116 :
                // InternalParser.g:1:1863: RULE_SKW_PLUSPLUS
                {
                mRULE_SKW_PLUSPLUS(); 

                }
                break;
            case 117 :
                // InternalParser.g:1:1881: RULE_SKW_QUESTION
                {
                mRULE_SKW_QUESTION(); 

                }
                break;
            case 118 :
                // InternalParser.g:1:1899: RULE_SKW_RIGHTBRACE
                {
                mRULE_SKW_RIGHTBRACE(); 

                }
                break;
            case 119 :
                // InternalParser.g:1:1919: RULE_SKW_RIGHTBRACKET
                {
                mRULE_SKW_RIGHTBRACKET(); 

                }
                break;
            case 120 :
                // InternalParser.g:1:1941: RULE_SKW_RIGHTPAREN
                {
                mRULE_SKW_RIGHTPAREN(); 

                }
                break;
            case 121 :
                // InternalParser.g:1:1961: RULE_SKW_RIGHTSHIFT
                {
                mRULE_SKW_RIGHTSHIFT(); 

                }
                break;
            case 122 :
                // InternalParser.g:1:1981: RULE_SKW_SEMI
                {
                mRULE_SKW_SEMI(); 

                }
                break;
            case 123 :
                // InternalParser.g:1:1995: RULE_SKW_SINGLEQUOTE
                {
                mRULE_SKW_SINGLEQUOTE(); 

                }
                break;
            case 124 :
                // InternalParser.g:1:2016: RULE_SKW_STAR
                {
                mRULE_SKW_STAR(); 

                }
                break;
            case 125 :
                // InternalParser.g:1:2030: RULE_SKW_TILDE
                {
                mRULE_SKW_TILDE(); 

                }
                break;
            case 126 :
                // InternalParser.g:1:2045: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 127 :
                // InternalParser.g:1:2053: RULE_CHAR_LITERAL
                {
                mRULE_CHAR_LITERAL(); 

                }
                break;
            case 128 :
                // InternalParser.g:1:2071: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 129 :
                // InternalParser.g:1:2091: RULE_HEX_LITERAL
                {
                mRULE_HEX_LITERAL(); 

                }
                break;
            case 130 :
                // InternalParser.g:1:2108: RULE_DECIMAL_LITERAL
                {
                mRULE_DECIMAL_LITERAL(); 

                }
                break;
            case 131 :
                // InternalParser.g:1:2129: RULE_OCTAL_LITERAL
                {
                mRULE_OCTAL_LITERAL(); 

                }
                break;
            case 132 :
                // InternalParser.g:1:2148: RULE_BIN_LITERAL
                {
                mRULE_BIN_LITERAL(); 

                }
                break;
            case 133 :
                // InternalParser.g:1:2165: RULE_FLOAT_LITERAL
                {
                mRULE_FLOAT_LITERAL(); 

                }
                break;
            case 134 :
                // InternalParser.g:1:2184: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 135 :
                // InternalParser.g:1:2197: RULE_IGNORED
                {
                mRULE_IGNORED(); 

                }
                break;
            case 136 :
                // InternalParser.g:1:2210: RULE_SPECIAL
                {
                mRULE_SPECIAL(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String DFA20_eotS =
        "\1\uffff\1\4\2\10\1\uffff\2\4\3\uffff";
    static final String DFA20_eofS =
        "\12\uffff";
    static final String DFA20_minS =
        "\2\114\1\154\1\114\1\uffff\1\154\1\114\3\uffff";
    static final String DFA20_maxS =
        "\1\165\2\154\1\114\1\uffff\1\154\1\114\3\uffff";
    static final String DFA20_acceptS =
        "\4\uffff\1\1\2\uffff\1\4\1\3\1\2";
    static final String DFA20_specialS =
        "\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\3\10\uffff\1\1\26\uffff\1\2\10\uffff\1\1",
            "\1\6\37\uffff\1\5",
            "\1\7",
            "\1\7",
            "",
            "\1\11",
            "\1\11",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "13906:37: ( RULE_UNSIGNED_SUFFIX ( RULE_LONG_SUFFIX )? | RULE_UNSIGNED_SUFFIX RULE_LONG_LONG_SUFFIX | RULE_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? | RULE_LONG_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? )";
        }
    }
    static final String DFA33_eotS =
        "\7\uffff\1\10\2\uffff";
    static final String DFA33_eofS =
        "\12\uffff";
    static final String DFA33_minS =
        "\2\56\1\uffff\1\53\2\uffff\2\60\2\uffff";
    static final String DFA33_maxS =
        "\1\71\1\146\1\uffff\1\71\2\uffff\1\71\1\146\2\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\1\2\uffff\2\3";
    static final String DFA33_specialS =
        "\12\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\5\1\uffff\12\1\12\uffff\1\4\1\3\1\4\35\uffff\1\4\1\3\1\4",
            "",
            "\1\6\1\uffff\1\6\2\uffff\12\7",
            "",
            "",
            "\12\7",
            "\12\7\12\uffff\1\11\1\uffff\1\11\35\uffff\1\11\1\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "13914:22: ( ( '0' .. '9' )+ RULE_SKW_DOT ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | RULE_SKW_DOT ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ ( RULE_EXPONENT )? RULE_FLOAT_TYPE_SUFFIX )";
        }
    }
    static final String DFA42_eotS =
        "\1\uffff\21\66\1\134\1\137\1\141\1\143\1\146\1\152\1\155\1\160\1\163\1\165\2\uffff\1\172\1\174\2\uffff\1\177\1\u0081\3\uffff\1\u0086\5\uffff\1\u008d\1\uffff\1\66\1\uffff\2\u0093\4\uffff\21\66\1\u00b2\6\66\1\u00b9\14\66\17\uffff\1\u00cd\2\uffff\1\u00cf\43\uffff\1\u00d1\1\uffff\1\u0093\1\uffff\25\66\1\u00e9\6\66\1\uffff\4\66\1\u00f5\1\66\1\uffff\1\66\1\u00f8\21\66\5\uffff\25\66\1\u0120\1\66\1\uffff\1\66\1\u0123\1\u0124\4\66\1\u0129\1\u012a\2\66\1\uffff\1\u012d\1\66\1\uffff\1\u012f\15\66\1\u013e\11\66\1\u0148\15\66\1\u0157\1\uffff\1\66\1\u015a\2\uffff\1\u015b\3\66\2\uffff\1\66\1\u0160\1\uffff\1\66\1\uffff\4\66\1\u0166\7\66\1\u016e\1\66\1\uffff\1\66\1\u0171\7\66\1\uffff\3\66\1\u017c\12\66\1\uffff\2\66\2\uffff\2\66\1\u018d\1\u018e\1\uffff\1\u018f\1\u0190\2\66\1\u0193\1\uffff\1\u0194\1\u0195\1\u0196\1\u0197\1\u0198\1\66\1\u019a\1\uffff\2\66\1\uffff\7\66\1\u01a5\2\66\1\uffff\1\u01a8\1\u01a9\3\66\1\u01ad\6\66\1\u01b4\1\u01b5\1\66\1\u01b7\4\uffff\2\66\6\uffff\1\u01ba\1\uffff\3\66\1\u01be\1\66\1\u01c1\1\u01c2\3\66\1\uffff\1\u01c7\1\66\2\uffff\2\66\1\u01cc\1\uffff\2\66\1\u01cf\1\66\1\u01d1\1\66\2\uffff\1\u01d3\1\uffff\1\u01d4\1\u01d5\1\uffff\1\u01d6\1\u01d7\1\66\1\uffff\2\66\2\uffff\2\66\1\u01dd\1\u01df\1\uffff\3\66\1\u01e4\1\uffff\1\66\1\u01e6\1\uffff\1\66\1\uffff\1\66\5\uffff\1\66\1\u01ea\1\66\1\u01ef\1\66\1\uffff\1\66\1\uffff\1\66\1\u01f3\1\u01f4\1\66\1\uffff\1\u01f7\1\uffff\3\66\1\uffff\4\66\1\uffff\1\u01ff\1\u0201\1\u0202\2\uffff\2\66\1\uffff\2\66\1\u0207\4\66\1\uffff\1\66\2\uffff\1\u020d\3\66\1\uffff\4\66\1\u0215\1\uffff\1\u0216\1\u0217\5\66\3\uffff\1\u021d\4\66\1\uffff\7\66\1\u0229\1\u022a\2\66\2\uffff\4\66\1\u0231\1\66\1\uffff\6\66\1\u0239\1\uffff";
    static final String DFA42_eofS =
        "\u023a\uffff";
    static final String DFA42_minS =
        "\1\0\1\101\1\154\1\162\1\141\1\145\2\154\1\157\1\146\1\157\1\162\1\145\1\150\1\171\1\156\1\157\1\150\1\75\1\52\1\75\1\53\1\55\1\74\1\75\1\46\2\75\2\uffff\1\75\1\12\2\uffff\1\60\1\0\3\uffff\1\75\5\uffff\1\0\1\uffff\1\47\1\uffff\2\56\4\uffff\1\141\1\154\1\155\2\157\1\150\1\145\1\164\1\157\1\164\1\151\1\155\1\145\1\163\1\141\1\156\1\146\1\44\1\163\1\165\1\164\1\157\1\162\1\164\1\44\1\154\1\156\1\141\1\147\1\157\1\147\1\141\1\151\1\160\3\151\17\uffff\1\75\2\uffff\1\75\43\uffff\1\56\1\uffff\1\56\1\uffff\1\157\1\171\1\165\1\156\1\154\1\151\1\145\1\61\1\170\1\141\1\151\1\157\1\141\1\162\1\155\1\162\1\156\1\141\2\157\1\147\1\44\1\141\1\145\1\162\1\163\1\141\1\142\1\uffff\1\145\1\155\1\145\1\141\1\44\1\157\1\uffff\1\151\1\44\2\147\1\151\1\164\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\145\1\157\1\151\1\144\1\141\1\154\5\uffff\1\154\1\160\1\151\1\154\1\164\1\151\1\155\1\147\1\163\1\62\1\164\1\142\1\147\1\155\1\147\1\145\1\160\2\145\1\164\1\154\1\44\1\156\1\uffff\1\153\2\44\1\164\1\151\1\165\1\154\2\44\1\162\1\164\1\uffff\1\44\1\156\1\uffff\1\44\1\155\1\163\2\162\1\164\1\145\1\157\1\151\2\143\1\144\1\156\1\147\1\44\1\164\1\145\1\141\1\145\1\154\1\61\1\151\1\162\1\147\1\44\1\156\1\164\1\70\2\145\1\156\2\151\1\164\1\154\1\141\1\162\1\151\1\44\1\uffff\1\145\1\44\2\uffff\1\44\1\156\1\154\1\145\2\uffff\1\156\1\44\1\uffff\1\145\1\uffff\1\141\1\164\1\151\1\156\1\44\1\144\1\146\1\143\1\164\1\150\1\145\1\146\1\44\1\156\1\uffff\1\151\1\44\1\164\1\157\1\164\1\62\1\156\1\151\1\156\1\uffff\1\137\1\145\1\162\1\44\1\156\1\154\1\141\1\143\1\156\1\165\1\145\1\144\1\151\1\143\1\uffff\1\144\1\146\2\uffff\1\165\1\164\2\44\1\uffff\2\44\1\145\1\143\1\44\1\uffff\5\44\1\146\1\44\1\uffff\1\145\1\154\1\uffff\1\151\1\146\1\151\1\70\1\145\1\142\1\145\1\44\1\144\1\151\1\uffff\2\44\1\163\1\137\1\163\1\44\1\141\1\162\1\170\1\137\1\143\1\137\2\44\1\145\1\44\4\uffff\1\162\1\164\6\uffff\1\44\1\uffff\1\144\1\145\1\154\1\44\1\156\2\44\1\165\1\144\1\146\1\uffff\1\44\1\143\2\uffff\1\151\1\137\1\44\1\uffff\1\162\1\156\1\44\1\154\1\44\1\141\2\uffff\1\44\1\uffff\2\44\1\uffff\2\44\1\145\1\uffff\2\137\2\uffff\1\137\1\164\2\44\1\uffff\1\137\1\164\1\157\1\44\1\uffff\1\171\1\44\1\uffff\1\157\1\uffff\1\163\5\uffff\1\137\1\44\1\143\1\44\1\145\1\uffff\1\137\1\uffff\1\137\2\44\1\156\1\uffff\1\44\1\uffff\1\143\1\163\1\137\1\uffff\1\146\1\150\1\171\1\141\1\uffff\3\44\2\uffff\2\137\1\uffff\1\141\1\145\1\44\1\146\1\157\1\160\1\137\1\uffff\1\137\2\uffff\1\44\1\137\1\154\1\162\1\uffff\1\163\1\157\1\145\1\154\1\44\1\uffff\2\44\1\164\1\145\2\163\1\151\3\uffff\1\44\1\164\1\145\1\137\1\163\1\uffff\1\157\1\137\1\143\1\164\1\146\1\145\1\157\2\44\1\170\1\155\2\uffff\2\160\1\162\1\141\1\44\1\164\1\uffff\1\151\1\142\1\154\1\145\1\137\1\160\1\44\1\uffff";
    static final String DFA42_maxS =
        "\1\uffff\1\137\1\165\1\162\2\157\1\170\2\157\1\156\1\157\1\162\1\145\1\167\1\171\1\156\1\157\1\150\4\75\1\76\1\75\1\76\2\75\1\174\2\uffff\1\75\1\15\2\uffff\1\71\1\uffff\3\uffff\1\75\5\uffff\1\uffff\1\uffff\1\47\1\uffff\1\170\1\146\4\uffff\1\166\1\164\1\155\2\157\1\150\1\145\1\164\1\157\1\164\1\151\1\155\1\145\1\163\1\141\1\156\1\146\1\172\1\163\1\165\1\164\1\157\1\162\1\164\1\172\1\164\1\156\1\141\1\164\1\157\1\172\1\162\1\151\1\160\1\163\1\154\1\151\17\uffff\1\75\2\uffff\1\75\43\uffff\1\146\1\uffff\1\146\1\uffff\1\157\1\171\1\165\1\156\1\164\1\151\1\145\1\61\1\170\1\141\1\151\1\157\1\141\1\162\1\155\1\162\1\156\1\141\2\157\1\147\1\172\1\141\1\145\1\162\1\164\1\141\1\142\1\uffff\1\145\1\155\1\145\1\141\1\172\1\157\1\uffff\1\151\1\172\2\147\1\151\1\164\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\145\1\157\1\151\1\144\1\141\1\154\5\uffff\1\154\1\160\1\151\2\164\1\151\1\155\1\147\1\163\1\62\1\164\1\142\1\147\1\155\1\147\1\145\1\160\2\145\1\164\1\154\1\172\1\156\1\uffff\1\153\2\172\1\164\1\151\1\165\1\154\2\172\1\162\1\164\1\uffff\1\172\1\156\1\uffff\1\172\1\155\1\163\2\162\1\164\1\145\1\157\1\151\2\143\1\157\1\156\1\147\1\172\1\164\1\145\1\141\1\145\1\154\1\61\1\151\1\162\1\147\1\172\1\156\1\164\1\70\2\145\1\156\2\151\1\164\1\154\1\141\1\162\1\151\1\172\1\uffff\1\157\1\172\2\uffff\1\172\1\156\1\154\1\145\2\uffff\1\156\1\172\1\uffff\1\145\1\uffff\1\141\1\164\1\151\1\156\1\172\1\144\1\146\1\143\1\164\1\150\1\145\1\146\1\172\1\156\1\uffff\1\151\1\172\1\164\1\157\1\164\1\62\1\156\1\151\1\156\1\uffff\1\137\1\145\1\162\1\172\1\156\1\154\1\141\1\143\1\156\1\165\1\145\1\144\1\151\1\143\1\uffff\1\144\1\146\2\uffff\1\165\1\164\2\172\1\uffff\2\172\1\145\1\143\1\172\1\uffff\5\172\1\146\1\172\1\uffff\1\145\1\154\1\uffff\1\151\1\146\1\151\1\70\1\145\1\142\1\157\1\172\1\144\1\151\1\uffff\2\172\1\163\1\137\1\163\1\172\1\141\1\162\1\170\1\137\1\143\1\137\2\172\1\145\1\172\4\uffff\1\162\1\164\6\uffff\1\172\1\uffff\1\144\1\145\1\154\1\172\1\156\2\172\1\165\1\144\1\146\1\uffff\1\172\1\143\2\uffff\1\151\1\137\1\172\1\uffff\1\162\1\156\1\172\1\154\1\172\1\141\2\uffff\1\172\1\uffff\2\172\1\uffff\2\172\1\145\1\uffff\2\137\2\uffff\1\137\1\164\2\172\1\uffff\1\137\1\164\1\157\1\172\1\uffff\1\171\1\172\1\uffff\1\157\1\uffff\1\163\5\uffff\1\137\1\172\1\166\1\172\1\145\1\uffff\1\137\1\uffff\1\137\2\172\1\156\1\uffff\1\172\1\uffff\1\143\1\163\1\137\1\uffff\1\146\1\150\1\171\1\141\1\uffff\3\172\2\uffff\2\137\1\uffff\1\141\1\145\1\172\1\146\1\157\1\160\1\137\1\uffff\1\137\2\uffff\1\172\1\137\1\154\1\162\1\uffff\1\163\1\157\1\145\1\154\1\172\1\uffff\2\172\1\164\1\145\2\163\1\151\3\uffff\1\172\1\164\1\145\1\137\1\163\1\uffff\1\157\1\137\1\143\1\164\1\146\1\145\1\157\2\172\1\170\1\155\2\uffff\2\160\1\162\1\141\1\172\1\164\1\uffff\1\151\1\142\1\154\1\145\1\137\1\160\1\172\1\uffff";
    static final String DFA42_acceptS =
        "\34\uffff\1\127\1\130\2\uffff\1\136\1\137\2\uffff\1\146\1\147\1\150\1\uffff\1\165\1\166\1\167\1\170\1\172\1\uffff\1\175\1\uffff\1\176\2\uffff\1\u0086\1\u0087\1\u0088\1\176\45\uffff\1\174\1\114\1\u0087\1\140\1\115\1\156\1\116\1\163\1\164\1\117\1\154\1\126\1\120\1\155\1\152\1\uffff\1\153\1\144\1\uffff\1\145\1\131\1\132\1\123\1\135\1\124\1\161\1\125\1\162\1\127\1\130\1\133\1\143\1\134\1\136\1\137\1\141\1\u0085\1\142\1\u0080\1\146\1\147\1\150\1\157\1\160\1\165\1\166\1\167\1\170\1\172\1\173\1\177\1\175\1\u0081\1\u0084\1\uffff\1\u0082\1\uffff\1\u0086\34\uffff\1\33\6\uffff\1\45\23\uffff\1\151\1\121\1\171\1\122\1\u0083\27\uffff\1\14\13\uffff\1\42\2\uffff\1\52\47\uffff\1\4\2\uffff\1\25\1\26\4\uffff\1\35\1\37\2\uffff\1\44\1\uffff\1\55\16\uffff\1\110\11\uffff\1\15\16\uffff\1\17\2\uffff\1\20\1\30\4\uffff\1\41\5\uffff\1\70\7\uffff\1\106\2\uffff\1\113\12\uffff\1\56\20\uffff\1\34\1\40\1\47\1\62\2\uffff\1\67\1\71\1\74\1\75\1\77\1\100\1\uffff\1\103\12\uffff\1\16\2\uffff\1\60\1\57\3\uffff\1\1\6\uffff\1\6\1\11\1\uffff\1\32\2\uffff\1\102\3\uffff\1\104\2\uffff\1\53\1\50\4\uffff\1\72\4\uffff\1\5\2\uffff\1\27\1\uffff\1\43\1\uffff\1\31\1\63\1\64\1\107\1\111\5\uffff\1\7\1\uffff\1\12\4\uffff\1\54\1\uffff\1\61\3\uffff\1\105\4\uffff\1\51\3\uffff\1\73\1\65\2\uffff\1\46\7\uffff\1\2\1\uffff\1\10\1\13\4\uffff\1\112\5\uffff\1\66\7\uffff\1\3\1\36\1\101\5\uffff\1\76\13\uffff\1\22\1\23\6\uffff\1\21\7\uffff\1\24";
    static final String DFA42_specialS =
        "\1\2\42\uffff\1\0\11\uffff\1\1\u020c\uffff}>";
    static final String[] DFA42_transitionS = {
            "\11\65\1\35\1\63\1\65\1\64\1\63\22\65\1\35\1\47\1\43\1\34\1\60\1\24\1\31\1\55\1\46\1\53\1\22\1\25\1\40\1\26\1\42\1\23\1\61\11\62\1\41\1\54\1\27\1\36\1\30\1\50\1\65\13\60\1\57\16\60\1\45\1\37\1\52\1\32\1\1\1\65\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\60\1\11\2\60\1\12\3\60\1\13\1\60\1\14\1\15\1\16\1\17\1\20\1\21\3\60\1\44\1\33\1\51\1\56\uff81\65",
            "\1\70\1\77\1\73\3\uffff\1\75\1\uffff\1\71\4\uffff\1\72\4\uffff\1\76\1\74\12\uffff\1\67",
            "\1\101\6\uffff\1\102\1\uffff\1\100",
            "\1\103",
            "\1\104\6\uffff\1\105\6\uffff\1\106",
            "\1\107\11\uffff\1\110",
            "\1\111\1\uffff\1\112\11\uffff\1\113",
            "\1\114\2\uffff\1\115",
            "\1\116",
            "\1\117\7\uffff\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124\1\125\12\uffff\1\126\2\uffff\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\135",
            "\1\136\4\uffff\1\136\15\uffff\1\140",
            "\1\142",
            "\1\144\21\uffff\1\145",
            "\1\151\17\uffff\1\150\1\147",
            "\1\153\1\154",
            "\1\157\1\156",
            "\1\161\26\uffff\1\162",
            "\1\164",
            "\1\166\76\uffff\1\167",
            "",
            "",
            "\1\173",
            "\1\136\2\uffff\1\136",
            "",
            "",
            "\12\u0080",
            "\0\u0082",
            "",
            "",
            "",
            "\1\u0087",
            "",
            "",
            "",
            "",
            "",
            "\47\u008e\1\uffff\uffd8\u008e",
            "",
            "\1\u008e",
            "",
            "\1\u0080\1\uffff\10\u0092\2\u0080\10\uffff\1\u0091\1\uffff\3\u0080\21\uffff\1\u0090\11\uffff\1\u0091\1\uffff\3\u0080\21\uffff\1\u0090",
            "\1\u0080\1\uffff\12\u0094\12\uffff\3\u0080\35\uffff\3\u0080",
            "",
            "",
            "",
            "",
            "\1\u009a\1\u0098\2\uffff\1\u009e\3\uffff\1\u0099\2\uffff\1\u009f\1\u009d\4\uffff\1\u009c\1\u009b\1\u0097\1\uffff\1\u0096",
            "\1\u00a0\7\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\24\66\1\u00b1\5\66",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00ba\7\uffff\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be\13\uffff\1\u00bf\1\u00c0",
            "\1\u00c1",
            "\1\u00c2\22\uffff\1\u00c3",
            "\1\u00c4\20\uffff\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8\11\uffff\1\u00c9",
            "\1\u00ca\2\uffff\1\u00cb",
            "\1\u00cc",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ce",
            "",
            "",
            "\1\u00d0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0080\1\uffff\10\u0092\2\u0080\12\uffff\3\u0080\35\uffff\3\u0080",
            "",
            "\1\u0080\1\uffff\12\u0094\12\uffff\3\u0080\35\uffff\3\u0080",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d7\6\uffff\1\u00d8\1\u00d6",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "",
            "",
            "",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010e\7\uffff\1\u010d",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u012b",
            "\1\u012c",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u012e",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a\12\uffff\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\u0149\1\uffff\32\66",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0158\11\uffff\1\u0159",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "",
            "",
            "\1\u015f",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0161",
            "",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u016f",
            "",
            "\1\u0170",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\3\66\1\u017e\4\66\1\u017d\21\66",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "\1\u0189",
            "\1\u018a",
            "",
            "",
            "\1\u018b",
            "\1\u018c",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0191",
            "\1\u0192",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0199",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u019b",
            "\1\u019c",
            "",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3\11\uffff\1\u01a4",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01b6",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "",
            "\1\u01b8",
            "\1\u01b9",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\u01bf\1\uffff\32\66",
            "\1\u01c0",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\u01c3\1\uffff\32\66",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\u01c8\1\uffff\32\66",
            "\1\u01c9",
            "",
            "",
            "\1\u01ca",
            "\1\u01cb",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01cd",
            "\1\u01ce",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01d0",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01d2",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01d8",
            "",
            "\1\u01d9",
            "\1\u01da",
            "",
            "",
            "\1\u01db",
            "\1\u01dc",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\u01de\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\u01e0\1\uffff\32\66",
            "",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01e5",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01e7",
            "",
            "\1\u01e8",
            "",
            "",
            "",
            "",
            "",
            "\1\u01e9",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01ec\13\uffff\1\u01eb\4\uffff\1\u01ed\1\uffff\1\u01ee",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01f0",
            "",
            "\1\u01f1",
            "",
            "\1\u01f2",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\u01f5\1\uffff\32\66",
            "\1\u01f6",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\u0200\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u0203",
            "\1\u0204",
            "",
            "\1\u0205",
            "\1\u0206",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "",
            "\1\u020c",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u022b",
            "\1\u022c",
            "",
            "",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0232",
            "",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_KW_ATOMIC | RULE_KW_ATTRIBUTE2 | RULE_KW_ATTRIBUTE3 | RULE_KW_AUTO | RULE_KW_ALIGNAS | RULE_KW_ALIGNED1 | RULE_KW_ALIGNED2 | RULE_KW_ALIGNED3 | RULE_KW_ALIGNOF1 | RULE_KW_ALIGNOF2 | RULE_KW_ALIGNOF3 | RULE_KW_ASM1 | RULE_KW_ASM2 | RULE_KW_ASM3 | RULE_KW_BOOL | RULE_KW_BREAK | RULE_KW_BUILTIN_CHOOSE_EXPR | RULE_KW_BUILTIN_VA_LIST | RULE_KW_BUILTIN_OFFSETOF | RULE_KW_BUILTIN_TYPESCOMPATIBLEP | RULE_KW_CASE | RULE_KW_CHAR | RULE_KW_COMPLEX | RULE_KW_CONST | RULE_KW_CONTINUE | RULE_KW_DEFAULT | RULE_KW_DO | RULE_KW_DOUBLE | RULE_KW_ELSE | RULE_KW_EXTENSION | RULE_KW_ENUM | RULE_KW_EXTERN | RULE_KW_FLOAT | RULE_KW_FOR | RULE_KW_GENERIC | RULE_KW_GOTO | RULE_KW_IF | RULE_KW_IMAGINARY | RULE_KW_INLINE1 | RULE_KW_INLINE2 | RULE_KW_INLINE3 | RULE_KW_INT | RULE_KW_INT128_3 | RULE_KW_LABEL3 | RULE_KW_LONG | RULE_KW_M128 | RULE_KW_M128D | RULE_KW_M128I | RULE_KW_NORETURN | RULE_KW_PRAGMA | RULE_KW_REGISTER | RULE_KW_RESTRICT | RULE_KW_RESTRICT2 | RULE_KW_RESTRICT3 | RULE_KW_RETURN | RULE_KW_SHORT | RULE_KW_SIGNED1 | RULE_KW_SIGNED2 | RULE_KW_SIGNED3 | RULE_KW_SIZEOF | RULE_KW_STATIC | RULE_KW_STATICASSERT | RULE_KW_STRUCT | RULE_KW_SWITCH | RULE_KW_THREADLOCAL | RULE_KW_TYPEDEF | RULE_KW_TYPEOF1 | RULE_KW_TYPEOF2 | RULE_KW_TYPEOF3 | RULE_KW_UNION | RULE_KW_UNSIGNED | RULE_KW_VOID | RULE_KW_VOLATILE | RULE_KW_VOLATILE2 | RULE_KW_WHILE | RULE_STARASSIGN | RULE_DIVASSIGN | RULE_MODASSIGN | RULE_PLUSASSIGN | RULE_MINUSASSIGN | RULE_LEFTSHIFTASSIGN | RULE_RIGHTSHIFTASSIGN | RULE_ANDASSIGN | RULE_XORASSIGN | RULE_ORASSIGN | RULE_ARROW | RULE_LINEDIRECTIVE | RULE_WHITESPACE | RULE_SKW_AND | RULE_SKW_ANDAND | RULE_SKW_ASSIGN | RULE_SKW_BACKSLASH | RULE_SKW_CARET | RULE_SKW_COMMA | RULE_SKW_COLON | RULE_SKW_DIV | RULE_SKW_DOT | RULE_SKW_DOUBLEQUOTE | RULE_SKW_EQUAL | RULE_SKW_GREATER | RULE_SKW_GREATEREQUAL | RULE_SKW_LEFTBRACE | RULE_SKW_LEFTBRACKET | RULE_SKW_LEFTPAREN | RULE_SKW_LEFTSHIFT | RULE_SKW_LESS | RULE_SKW_LESSEQUAL | RULE_SKW_MINUS | RULE_SKW_MINUSMINUS | RULE_SKW_MOD | RULE_SKW_NOT | RULE_SKW_NOTEQUAL | RULE_SKW_OR | RULE_SKW_OROR | RULE_SKW_PLUS | RULE_SKW_PLUSPLUS | RULE_SKW_QUESTION | RULE_SKW_RIGHTBRACE | RULE_SKW_RIGHTBRACKET | RULE_SKW_RIGHTPAREN | RULE_SKW_RIGHTSHIFT | RULE_SKW_SEMI | RULE_SKW_SINGLEQUOTE | RULE_SKW_STAR | RULE_SKW_TILDE | RULE_ID | RULE_CHAR_LITERAL | RULE_STRING_LITERAL | RULE_HEX_LITERAL | RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_BIN_LITERAL | RULE_FLOAT_LITERAL | RULE_NEWLINE | RULE_IGNORED | RULE_SPECIAL );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
            int _s = s;
            switch ( s ) {
                    case 0 : 
                        s = specialState0(s, input);
                        if (s >= 0) return s;
                        break;
                    
                    case 1 : 
                        s = specialState1(s, input);
                        if (s >= 0) return s;
                        break;
                    
                    case 2 : 
                        s = specialState2(s, input);
                        if (s >= 0) return s;
                        break;
                    
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }

        private int specialState0(int s, IntStream _input) {
            IntStream input = _input;
            int LA42_35 = input.LA(1);

            s = -1;
            if ( ((LA42_35>='\u0000' && LA42_35<='\uFFFF')) ) {s = 130;}

            else s = 129;

            return s;
        }

        private int specialState1(int s, IntStream _input) {
            IntStream input = _input;
            int LA42_45 = input.LA(1);

            s = -1;
            if ( ((LA42_45>='\u0000' && LA42_45<='&')||(LA42_45>='(' && LA42_45<='\uFFFF')) ) {s = 142;}

            else s = 141;

            return s;
        }

        private int specialState2(int s, IntStream _input) {
            IntStream input = _input;
            int LA42_0 = input.LA(1);

            s = -1;
            if ( (LA42_0=='_') ) {s = 1;}

            else if ( (LA42_0=='a') ) {s = 2;}

            else if ( (LA42_0=='b') ) {s = 3;}

            else if ( (LA42_0=='c') ) {s = 4;}

            else if ( (LA42_0=='d') ) {s = 5;}

            else if ( (LA42_0=='e') ) {s = 6;}

            else if ( (LA42_0=='f') ) {s = 7;}

            else if ( (LA42_0=='g') ) {s = 8;}

            else if ( (LA42_0=='i') ) {s = 9;}

            else if ( (LA42_0=='l') ) {s = 10;}

            else if ( (LA42_0=='p') ) {s = 11;}

            else if ( (LA42_0=='r') ) {s = 12;}

            else if ( (LA42_0=='s') ) {s = 13;}

            else if ( (LA42_0=='t') ) {s = 14;}

            else if ( (LA42_0=='u') ) {s = 15;}

            else if ( (LA42_0=='v') ) {s = 16;}

            else if ( (LA42_0=='w') ) {s = 17;}

            else if ( (LA42_0=='*') ) {s = 18;}

            else if ( (LA42_0=='/') ) {s = 19;}

            else if ( (LA42_0=='%') ) {s = 20;}

            else if ( (LA42_0=='+') ) {s = 21;}

            else if ( (LA42_0=='-') ) {s = 22;}

            else if ( (LA42_0=='<') ) {s = 23;}

            else if ( (LA42_0=='>') ) {s = 24;}

            else if ( (LA42_0=='&') ) {s = 25;}

            else if ( (LA42_0=='^') ) {s = 26;}

            else if ( (LA42_0=='|') ) {s = 27;}

            else if ( (LA42_0=='#') ) {s = 28;}

            else if ( (LA42_0=='\t'||LA42_0==' ') ) {s = 29;}

            else if ( (LA42_0=='=') ) {s = 30;}

            else if ( (LA42_0=='\\') ) {s = 31;}

            else if ( (LA42_0==',') ) {s = 32;}

            else if ( (LA42_0==':') ) {s = 33;}

            else if ( (LA42_0=='.') ) {s = 34;}

            else if ( (LA42_0=='\"') ) {s = 35;}

            else if ( (LA42_0=='{') ) {s = 36;}

            else if ( (LA42_0=='[') ) {s = 37;}

            else if ( (LA42_0=='(') ) {s = 38;}

            else if ( (LA42_0=='!') ) {s = 39;}

            else if ( (LA42_0=='?') ) {s = 40;}

            else if ( (LA42_0=='}') ) {s = 41;}

            else if ( (LA42_0==']') ) {s = 42;}

            else if ( (LA42_0==')') ) {s = 43;}

            else if ( (LA42_0==';') ) {s = 44;}

            else if ( (LA42_0=='\'') ) {s = 45;}

            else if ( (LA42_0=='~') ) {s = 46;}

            else if ( (LA42_0=='L') ) {s = 47;}

            else if ( (LA42_0=='$'||(LA42_0>='A' && LA42_0<='K')||(LA42_0>='M' && LA42_0<='Z')||LA42_0=='h'||(LA42_0>='j' && LA42_0<='k')||(LA42_0>='m' && LA42_0<='o')||LA42_0=='q'||(LA42_0>='x' && LA42_0<='z')) ) {s = 48;}

            else if ( (LA42_0=='0') ) {s = 49;}

            else if ( ((LA42_0>='1' && LA42_0<='9')) ) {s = 50;}

            else if ( (LA42_0=='\n'||LA42_0=='\r') ) {s = 51;}

            else if ( (LA42_0=='\f') ) {s = 52;}

            else if ( ((LA42_0>='\u0000' && LA42_0<='\b')||LA42_0=='\u000B'||(LA42_0>='\u000E' && LA42_0<='\u001F')||LA42_0=='@'||LA42_0=='`'||(LA42_0>='\u007F' && LA42_0<='\uFFFF')) ) {s = 53;}

            return s;
        }
    }
 

}