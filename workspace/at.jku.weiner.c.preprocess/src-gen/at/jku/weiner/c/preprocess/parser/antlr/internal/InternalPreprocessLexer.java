package at.jku.weiner.c.preprocess.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalPreprocessLexer extends Lexer {
    public static final int RULE_PRAGMA=23;
    public static final int RULE_ID=24;
    public static final int RULE_SKW_DOT=52;
    public static final int RULE_SKW_PLUS=43;
    public static final int RULE_SKW_GREATEREQUAL=40;
    public static final int EOF=-1;
    public static final int RULE_SKW_LESS=37;
    public static final int RULE_SKW_RIGHTPAREN=11;
    public static final int RULE_ENDIF=17;
    public static final int RULE_LINEBREAK=75;
    public static final int RULE_SKW_LESSEQUAL=39;
    public static final int RULE_UNSIGNED_SUFFIX=78;
    public static final int RULE_DECIMAL_LITERAL=64;
    public static final int RULE_HEX_LITERAL=62;
    public static final int RULE_SKW_AND=34;
    public static final int RULE_WARNING=15;
    public static final int RULE_WHITESPACE=5;
    public static final int RULE_OCTAL_LITERAL=63;
    public static final int RULE_SKW_COMMA=12;
    public static final int SUPER_NEWLINE=70;
    public static final int RULE_BLOCK_COMMENT=90;
    public static final int RULE_SKW_COLON=29;
    public static final int RULE_BIN_LITERAL=68;
    public static final int RULE_SKW_LEFTPAREN=10;
    public static final int RULE_SKW_MINUS=44;
    public static final int RULE_IFDEF=19;
    public static final int RULE_SKW_EQUAL=35;
    public static final int RULE_SKW_DIV=46;
    public static final int RULE_SKW_ANDAND=31;
    public static final int RULE_HEX_DIGIT=76;
    public static final int RULE_SKW_GREATER=38;
    public static final int RULE_HASH=6;
    public static final int RULE_TAB=89;
    public static final int RULE_HEX_ESCAPE=84;
    public static final int RULE_SKW_LEFTBRACKET=55;
    public static final int RULE_LETTER=73;
    public static final int RULE_EXPONENT=81;
    public static final int RULE_DEFINE=9;
    public static final int RULE_SPECIAL=25;
    public static final int RULE_INCLUDE=7;
    public static final int RULE_SKW_UNDERSCORE=69;
    public static final int RULE_ELIF=21;
    public static final int RULE_LINE_END=87;
    public static final int RULE_IF=18;
    public static final int RULE_IGNORED=93;
    public static final int RULE_OCTAL_ESCAPE=83;
    public static final int RULE_SKW_NOT=49;
    public static final int RULE_LONG_LONG_SUFFIX=80;
    public static final int RULE_ESCAPE_SEQUENCE=74;
    public static final int RULE_SKW_RIGHTSHIFT=42;
    public static final int RULE_DEFINED=26;
    public static final int RULE_SKW_NOTEQUAL=36;
    public static final int RULE_SKW_RIGHTBRACE=58;
    public static final int RULE_VA_ARGS=27;
    public static final int RULE_FORM_FEED=92;
    public static final int RULE_SKW_STAR=45;
    public static final int RULE_STRING_LITERAL=66;
    public static final int RULE_SKW_DOUBLEQUOTE=53;
    public static final int RULE_SKW_PLUSPLUS=57;
    public static final int RULE_SKW_OROR=30;
    public static final int RULE_SKW_CARET=33;
    public static final int RULE_SKW_RIGHTBRACKET=59;
    public static final int RULE_SPACE=88;
    public static final int RULE_LINEFEED=85;
    public static final int RULE_LINE=13;
    public static final int RULE_INCLUDE_NEXT=8;
    public static final int RULE_SKW_SEMI=60;
    public static final int RULE_NEWLINE=4;
    public static final int RULE_SKW_DOLLAR=71;
    public static final int RULE_SKW_LEFTSHIFT=41;
    public static final int RULE_SKW_QUESTION=28;
    public static final int RULE_ERROR=14;
    public static final int RULE_IDENTIFIER=72;
    public static final int RULE_SKW_SINGLEQUOTE=61;
    public static final int RULE_SKW_MOD=47;
    public static final int RULE_UNDEF=16;
    public static final int RULE_SKW_MINUSMINUS=56;
    public static final int RULE_FLOAT_TYPE_SUFFIX=82;
    public static final int RULE_IFNOTDEF=20;
    public static final int RULE_INTEGER_TYPE_SUFFIX=77;
    public static final int RULE_CARRIAGERETURN=86;
    public static final int RULE_SKW_TILDE=48;
    public static final int RULE_LINE_COMMENT=91;
    public static final int RULE_SKW_BACKSLASH=51;
    public static final int RULE_SKW_OR=32;
    public static final int RULE_CHAR_LITERAL=65;
    public static final int RULE_ELSE=22;
    public static final int RULE_FLOAT_LITERAL=67;
    public static final int RULE_SKW_LEFTBRACE=54;
    public static final int RULE_SKW_ASSIGN=50;
    public static final int RULE_LONG_SUFFIX=79;

    // delegates
    // delegators

    public InternalPreprocessLexer() {;} 
    public InternalPreprocessLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPreprocessLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPreprocess.g"; }

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5885:11: ( '#' )
            // InternalPreprocess.g:5885:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_INCLUDE"
    public final void mRULE_INCLUDE() throws RecognitionException {
        try {
            int _type = RULE_INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5887:14: ( 'include' )
            // InternalPreprocess.g:5887:16: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCLUDE"

    // $ANTLR start "RULE_INCLUDE_NEXT"
    public final void mRULE_INCLUDE_NEXT() throws RecognitionException {
        try {
            int _type = RULE_INCLUDE_NEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5889:19: ( RULE_INCLUDE RULE_SKW_UNDERSCORE 'next' )
            // InternalPreprocess.g:5889:21: RULE_INCLUDE RULE_SKW_UNDERSCORE 'next'
            {
            mRULE_INCLUDE(); 
            mRULE_SKW_UNDERSCORE(); 
            match("next"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCLUDE_NEXT"

    // $ANTLR start "RULE_DEFINE"
    public final void mRULE_DEFINE() throws RecognitionException {
        try {
            int _type = RULE_DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5891:13: ( 'define' )
            // InternalPreprocess.g:5891:15: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFINE"

    // $ANTLR start "RULE_LINE"
    public final void mRULE_LINE() throws RecognitionException {
        try {
            int _type = RULE_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5893:11: ( 'line' )
            // InternalPreprocess.g:5893:13: 'line'
            {
            match("line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINE"

    // $ANTLR start "RULE_ERROR"
    public final void mRULE_ERROR() throws RecognitionException {
        try {
            int _type = RULE_ERROR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5895:12: ( 'error' )
            // InternalPreprocess.g:5895:14: 'error'
            {
            match("error"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ERROR"

    // $ANTLR start "RULE_WARNING"
    public final void mRULE_WARNING() throws RecognitionException {
        try {
            int _type = RULE_WARNING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5897:14: ( 'warning' )
            // InternalPreprocess.g:5897:16: 'warning'
            {
            match("warning"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WARNING"

    // $ANTLR start "RULE_UNDEF"
    public final void mRULE_UNDEF() throws RecognitionException {
        try {
            int _type = RULE_UNDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5899:12: ( 'undef' )
            // InternalPreprocess.g:5899:14: 'undef'
            {
            match("undef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNDEF"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5901:9: ( 'if' )
            // InternalPreprocess.g:5901:11: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF"

    // $ANTLR start "RULE_DEFINED"
    public final void mRULE_DEFINED() throws RecognitionException {
        try {
            int _type = RULE_DEFINED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5903:14: ( 'defined' )
            // InternalPreprocess.g:5903:16: 'defined'
            {
            match("defined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFINED"

    // $ANTLR start "RULE_IFDEF"
    public final void mRULE_IFDEF() throws RecognitionException {
        try {
            int _type = RULE_IFDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5905:12: ( 'ifdef' )
            // InternalPreprocess.g:5905:14: 'ifdef'
            {
            match("ifdef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IFDEF"

    // $ANTLR start "RULE_IFNOTDEF"
    public final void mRULE_IFNOTDEF() throws RecognitionException {
        try {
            int _type = RULE_IFNOTDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5907:15: ( 'ifndef' )
            // InternalPreprocess.g:5907:17: 'ifndef'
            {
            match("ifndef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IFNOTDEF"

    // $ANTLR start "RULE_ELIF"
    public final void mRULE_ELIF() throws RecognitionException {
        try {
            int _type = RULE_ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5909:11: ( 'elif' )
            // InternalPreprocess.g:5909:13: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELIF"

    // $ANTLR start "RULE_ELSE"
    public final void mRULE_ELSE() throws RecognitionException {
        try {
            int _type = RULE_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5911:11: ( 'else' )
            // InternalPreprocess.g:5911:13: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE"

    // $ANTLR start "RULE_ENDIF"
    public final void mRULE_ENDIF() throws RecognitionException {
        try {
            int _type = RULE_ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5913:12: ( 'endif' )
            // InternalPreprocess.g:5913:14: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENDIF"

    // $ANTLR start "RULE_PRAGMA"
    public final void mRULE_PRAGMA() throws RecognitionException {
        try {
            int _type = RULE_PRAGMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5915:13: ( 'pragma' )
            // InternalPreprocess.g:5915:15: 'pragma'
            {
            match("pragma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRAGMA"

    // $ANTLR start "RULE_VA_ARGS"
    public final void mRULE_VA_ARGS() throws RecognitionException {
        try {
            int _type = RULE_VA_ARGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5917:14: ( RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'VA_ARGS' RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE )
            // InternalPreprocess.g:5917:16: RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE 'VA_ARGS' RULE_SKW_UNDERSCORE RULE_SKW_UNDERSCORE
            {
            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 
            match("VA_ARGS"); 

            mRULE_SKW_UNDERSCORE(); 
            mRULE_SKW_UNDERSCORE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VA_ARGS"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5919:14: ( SUPER_NEWLINE )
            // InternalPreprocess.g:5919:16: SUPER_NEWLINE
            {
            mSUPER_NEWLINE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_SKW_AND"
    public final void mRULE_SKW_AND() throws RecognitionException {
        try {
            int _type = RULE_SKW_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:5921:14: ( '&' )
            // InternalPreprocess.g:5921:16: '&'
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
            // InternalPreprocess.g:5923:17: ( RULE_SKW_AND RULE_SKW_AND )
            // InternalPreprocess.g:5923:19: RULE_SKW_AND RULE_SKW_AND
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
            // InternalPreprocess.g:5925:17: ( '=' )
            // InternalPreprocess.g:5925:19: '='
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
            // InternalPreprocess.g:5927:20: ( '\\\\' )
            // InternalPreprocess.g:5927:22: '\\\\'
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
            // InternalPreprocess.g:5929:16: ( '^' )
            // InternalPreprocess.g:5929:18: '^'
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
            // InternalPreprocess.g:5931:16: ( ',' )
            // InternalPreprocess.g:5931:18: ','
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
            // InternalPreprocess.g:5933:16: ( ':' )
            // InternalPreprocess.g:5933:18: ':'
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
            // InternalPreprocess.g:5935:14: ( '/' )
            // InternalPreprocess.g:5935:16: '/'
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
            // InternalPreprocess.g:5937:26: ( '$' )
            // InternalPreprocess.g:5937:28: '$'
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
            // InternalPreprocess.g:5939:14: ( '.' )
            // InternalPreprocess.g:5939:16: '.'
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
            // InternalPreprocess.g:5941:22: ( '\"' )
            // InternalPreprocess.g:5941:24: '\"'
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
            // InternalPreprocess.g:5943:16: ( RULE_SKW_ASSIGN RULE_SKW_ASSIGN )
            // InternalPreprocess.g:5943:18: RULE_SKW_ASSIGN RULE_SKW_ASSIGN
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
            // InternalPreprocess.g:5945:18: ( '>' )
            // InternalPreprocess.g:5945:20: '>'
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
            // InternalPreprocess.g:5947:23: ( RULE_SKW_GREATER RULE_SKW_ASSIGN )
            // InternalPreprocess.g:5947:25: RULE_SKW_GREATER RULE_SKW_ASSIGN
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
            // InternalPreprocess.g:5949:20: ( '{' )
            // InternalPreprocess.g:5949:22: '{'
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
            // InternalPreprocess.g:5951:22: ( '[' )
            // InternalPreprocess.g:5951:24: '['
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
            // InternalPreprocess.g:5953:20: ( '(' )
            // InternalPreprocess.g:5953:22: '('
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
            // InternalPreprocess.g:5955:20: ( RULE_SKW_LESS RULE_SKW_LESS )
            // InternalPreprocess.g:5955:22: RULE_SKW_LESS RULE_SKW_LESS
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
            // InternalPreprocess.g:5957:15: ( '<' )
            // InternalPreprocess.g:5957:17: '<'
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
            // InternalPreprocess.g:5959:20: ( RULE_SKW_LESS RULE_SKW_ASSIGN )
            // InternalPreprocess.g:5959:22: RULE_SKW_LESS RULE_SKW_ASSIGN
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
            // InternalPreprocess.g:5961:16: ( '-' )
            // InternalPreprocess.g:5961:18: '-'
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
            // InternalPreprocess.g:5963:21: ( RULE_SKW_MINUS RULE_SKW_MINUS )
            // InternalPreprocess.g:5963:23: RULE_SKW_MINUS RULE_SKW_MINUS
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
            // InternalPreprocess.g:5965:14: ( '%' )
            // InternalPreprocess.g:5965:16: '%'
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
            // InternalPreprocess.g:5967:14: ( '!' )
            // InternalPreprocess.g:5967:16: '!'
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
            // InternalPreprocess.g:5969:19: ( RULE_SKW_NOT RULE_SKW_ASSIGN )
            // InternalPreprocess.g:5969:21: RULE_SKW_NOT RULE_SKW_ASSIGN
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
            // InternalPreprocess.g:5971:13: ( '|' )
            // InternalPreprocess.g:5971:15: '|'
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
            // InternalPreprocess.g:5973:15: ( RULE_SKW_OR RULE_SKW_OR )
            // InternalPreprocess.g:5973:17: RULE_SKW_OR RULE_SKW_OR
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
            // InternalPreprocess.g:5975:15: ( '+' )
            // InternalPreprocess.g:5975:17: '+'
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
            // InternalPreprocess.g:5977:19: ( RULE_SKW_PLUS RULE_SKW_PLUS )
            // InternalPreprocess.g:5977:21: RULE_SKW_PLUS RULE_SKW_PLUS
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
            // InternalPreprocess.g:5979:19: ( '?' )
            // InternalPreprocess.g:5979:21: '?'
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
            // InternalPreprocess.g:5981:21: ( '}' )
            // InternalPreprocess.g:5981:23: '}'
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
            // InternalPreprocess.g:5983:23: ( ']' )
            // InternalPreprocess.g:5983:25: ']'
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
            // InternalPreprocess.g:5985:21: ( ')' )
            // InternalPreprocess.g:5985:23: ')'
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
            // InternalPreprocess.g:5987:21: ( RULE_SKW_GREATER RULE_SKW_GREATER )
            // InternalPreprocess.g:5987:23: RULE_SKW_GREATER RULE_SKW_GREATER
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
            // InternalPreprocess.g:5989:15: ( ';' )
            // InternalPreprocess.g:5989:17: ';'
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
            // InternalPreprocess.g:5991:22: ( '\\'' )
            // InternalPreprocess.g:5991:24: '\\''
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
            // InternalPreprocess.g:5993:15: ( '*' )
            // InternalPreprocess.g:5993:17: '*'
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
            // InternalPreprocess.g:5995:16: ( '~' )
            // InternalPreprocess.g:5995:18: '~'
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
            // InternalPreprocess.g:5997:30: ( '_' )
            // InternalPreprocess.g:5997:32: '_'
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
            // InternalPreprocess.g:5999:9: ( RULE_IDENTIFIER )
            // InternalPreprocess.g:5999:11: RULE_IDENTIFIER
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
            // InternalPreprocess.g:6001:26: ( RULE_LETTER ( RULE_LETTER | '0' .. '9' )* )
            // InternalPreprocess.g:6001:28: RULE_LETTER ( RULE_LETTER | '0' .. '9' )*
            {
            mRULE_LETTER(); 
            // InternalPreprocess.g:6001:40: ( RULE_LETTER | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPreprocess.g:
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
            	    break loop1;
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
            // InternalPreprocess.g:6003:22: ( ( RULE_SKW_DOLLAR | 'A' .. 'Z' | 'a' .. 'z' | RULE_SKW_UNDERSCORE ) )
            // InternalPreprocess.g:6003:24: ( RULE_SKW_DOLLAR | 'A' .. 'Z' | 'a' .. 'z' | RULE_SKW_UNDERSCORE )
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
            // InternalPreprocess.g:6005:19: ( ( 'L' )? RULE_SKW_SINGLEQUOTE ( RULE_ESCAPE_SEQUENCE | ~ ( ( RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) ) | RULE_LINEBREAK ) RULE_SKW_SINGLEQUOTE )
            // InternalPreprocess.g:6005:21: ( 'L' )? RULE_SKW_SINGLEQUOTE ( RULE_ESCAPE_SEQUENCE | ~ ( ( RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) ) | RULE_LINEBREAK ) RULE_SKW_SINGLEQUOTE
            {
            // InternalPreprocess.g:6005:21: ( 'L' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='L') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPreprocess.g:6005:21: 'L'
                    {
                    match('L'); 

                    }
                    break;

            }

            mRULE_SKW_SINGLEQUOTE(); 
            // InternalPreprocess.g:6005:47: ( RULE_ESCAPE_SEQUENCE | ~ ( ( RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) ) | RULE_LINEBREAK )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\\') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='\"'||LA3_1=='\''||(LA3_1>='0' && LA3_1<='7')||LA3_1=='\\'||LA3_1=='b'||LA3_1=='f'||LA3_1=='n'||LA3_1=='r'||LA3_1=='t'||LA3_1=='x') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='\n'||LA3_1=='\r') ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPreprocess.g:6005:48: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 2 :
                    // InternalPreprocess.g:6005:69: ~ ( ( RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) )
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
                    // InternalPreprocess.g:6005:114: RULE_LINEBREAK
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
            // InternalPreprocess.g:6007:21: ( RULE_SKW_DOUBLEQUOTE ( RULE_ESCAPE_SEQUENCE | ~ ( ( RULE_SKW_BACKSLASH | RULE_SKW_DOUBLEQUOTE ) ) | RULE_LINEBREAK )* RULE_SKW_DOUBLEQUOTE )
            // InternalPreprocess.g:6007:23: RULE_SKW_DOUBLEQUOTE ( RULE_ESCAPE_SEQUENCE | ~ ( ( RULE_SKW_BACKSLASH | RULE_SKW_DOUBLEQUOTE ) ) | RULE_LINEBREAK )* RULE_SKW_DOUBLEQUOTE
            {
            mRULE_SKW_DOUBLEQUOTE(); 
            // InternalPreprocess.g:6007:44: ( RULE_ESCAPE_SEQUENCE | ~ ( ( RULE_SKW_BACKSLASH | RULE_SKW_DOUBLEQUOTE ) ) | RULE_LINEBREAK )*
            loop4:
            do {
                int alt4=4;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2=='\"'||LA4_2=='\''||(LA4_2>='0' && LA4_2<='7')||LA4_2=='\\'||LA4_2=='b'||LA4_2=='f'||LA4_2=='n'||LA4_2=='r'||LA4_2=='t'||LA4_2=='x') ) {
                        alt4=1;
                    }
                    else if ( (LA4_2=='\n'||LA4_2=='\r') ) {
                        alt4=3;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPreprocess.g:6007:45: RULE_ESCAPE_SEQUENCE
            	    {
            	    mRULE_ESCAPE_SEQUENCE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalPreprocess.g:6007:66: ~ ( ( RULE_SKW_BACKSLASH | RULE_SKW_DOUBLEQUOTE ) )
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
            	    // InternalPreprocess.g:6007:111: RULE_LINEBREAK
            	    {
            	    mRULE_LINEBREAK(); 

            	    }
            	    break;

            	default :
            	    break loop4;
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
            // InternalPreprocess.g:6009:18: ( '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ ( RULE_INTEGER_TYPE_SUFFIX )? )
            // InternalPreprocess.g:6009:20: '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPreprocess.g:6009:34: ( RULE_HEX_DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='F')||(LA5_0>='a' && LA5_0<='f')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPreprocess.g:6009:34: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalPreprocess.g:6009:50: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='L'||LA6_0=='U'||LA6_0=='l'||LA6_0=='u') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPreprocess.g:6009:50: RULE_INTEGER_TYPE_SUFFIX
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

    // $ANTLR start "RULE_DECIMAL_LITERAL"
    public final void mRULE_DECIMAL_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:6011:22: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( RULE_INTEGER_TYPE_SUFFIX )? )
            // InternalPreprocess.g:6011:24: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            // InternalPreprocess.g:6011:24: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='0') ) {
                alt8=1;
            }
            else if ( ((LA8_0>='1' && LA8_0<='9')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPreprocess.g:6011:25: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalPreprocess.g:6011:29: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalPreprocess.g:6011:38: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPreprocess.g:6011:39: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPreprocess.g:6011:51: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='L'||LA9_0=='U'||LA9_0=='l'||LA9_0=='u') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPreprocess.g:6011:51: RULE_INTEGER_TYPE_SUFFIX
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
            // InternalPreprocess.g:6013:20: ( '0' ( '0' .. '7' )+ ( RULE_INTEGER_TYPE_SUFFIX )? )
            // InternalPreprocess.g:6013:22: '0' ( '0' .. '7' )+ ( RULE_INTEGER_TYPE_SUFFIX )?
            {
            match('0'); 
            // InternalPreprocess.g:6013:26: ( '0' .. '7' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='7')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPreprocess.g:6013:27: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalPreprocess.g:6013:38: ( RULE_INTEGER_TYPE_SUFFIX )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='L'||LA11_0=='U'||LA11_0=='l'||LA11_0=='u') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPreprocess.g:6013:38: RULE_INTEGER_TYPE_SUFFIX
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
            // InternalPreprocess.g:6015:18: ( ( '0b' | '0B' ) ( '0' .. '1' )+ )
            // InternalPreprocess.g:6015:20: ( '0b' | '0B' ) ( '0' .. '1' )+
            {
            // InternalPreprocess.g:6015:20: ( '0b' | '0B' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='0') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='b') ) {
                    alt12=1;
                }
                else if ( (LA12_1=='B') ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPreprocess.g:6015:21: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalPreprocess.g:6015:26: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalPreprocess.g:6015:32: ( '0' .. '1' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='1')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPreprocess.g:6015:33: '0' .. '1'
            	    {
            	    matchRange('0','1'); 

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
            // InternalPreprocess.g:6017:25: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalPreprocess.g:6017:27: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // InternalPreprocess.g:6019:35: ( ( RULE_UNSIGNED_SUFFIX ( RULE_LONG_SUFFIX )? | RULE_UNSIGNED_SUFFIX RULE_LONG_LONG_SUFFIX | RULE_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? | RULE_LONG_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? ) )
            // InternalPreprocess.g:6019:37: ( RULE_UNSIGNED_SUFFIX ( RULE_LONG_SUFFIX )? | RULE_UNSIGNED_SUFFIX RULE_LONG_LONG_SUFFIX | RULE_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? | RULE_LONG_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? )
            {
            // InternalPreprocess.g:6019:37: ( RULE_UNSIGNED_SUFFIX ( RULE_LONG_SUFFIX )? | RULE_UNSIGNED_SUFFIX RULE_LONG_LONG_SUFFIX | RULE_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? | RULE_LONG_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? )
            int alt17=4;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalPreprocess.g:6019:38: RULE_UNSIGNED_SUFFIX ( RULE_LONG_SUFFIX )?
                    {
                    mRULE_UNSIGNED_SUFFIX(); 
                    // InternalPreprocess.g:6019:59: ( RULE_LONG_SUFFIX )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='L'||LA14_0=='l') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalPreprocess.g:6019:59: RULE_LONG_SUFFIX
                            {
                            mRULE_LONG_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalPreprocess.g:6019:77: RULE_UNSIGNED_SUFFIX RULE_LONG_LONG_SUFFIX
                    {
                    mRULE_UNSIGNED_SUFFIX(); 
                    mRULE_LONG_LONG_SUFFIX(); 

                    }
                    break;
                case 3 :
                    // InternalPreprocess.g:6019:120: RULE_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )?
                    {
                    mRULE_LONG_SUFFIX(); 
                    // InternalPreprocess.g:6019:137: ( RULE_UNSIGNED_SUFFIX )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='U'||LA15_0=='u') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalPreprocess.g:6019:137: RULE_UNSIGNED_SUFFIX
                            {
                            mRULE_UNSIGNED_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalPreprocess.g:6019:159: RULE_LONG_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )?
                    {
                    mRULE_LONG_LONG_SUFFIX(); 
                    // InternalPreprocess.g:6019:181: ( RULE_UNSIGNED_SUFFIX )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='U'||LA16_0=='u') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalPreprocess.g:6019:181: RULE_UNSIGNED_SUFFIX
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
            // InternalPreprocess.g:6021:31: ( ( 'u' | 'U' ) )
            // InternalPreprocess.g:6021:33: ( 'u' | 'U' )
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
            // InternalPreprocess.g:6023:27: ( ( 'l' | 'L' ) )
            // InternalPreprocess.g:6023:29: ( 'l' | 'L' )
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
            // InternalPreprocess.g:6025:32: ( ( 'll' | 'LL' ) )
            // InternalPreprocess.g:6025:34: ( 'll' | 'LL' )
            {
            // InternalPreprocess.g:6025:34: ( 'll' | 'LL' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='l') ) {
                alt18=1;
            }
            else if ( (LA18_0=='L') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalPreprocess.g:6025:35: 'll'
                    {
                    match("ll"); 


                    }
                    break;
                case 2 :
                    // InternalPreprocess.g:6025:40: 'LL'
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
            // InternalPreprocess.g:6027:20: ( ( ( '0' .. '9' )+ RULE_SKW_DOT ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | RULE_SKW_DOT ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ ( RULE_EXPONENT )? RULE_FLOAT_TYPE_SUFFIX ) )
            // InternalPreprocess.g:6027:22: ( ( '0' .. '9' )+ RULE_SKW_DOT ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | RULE_SKW_DOT ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ ( RULE_EXPONENT )? RULE_FLOAT_TYPE_SUFFIX )
            {
            // InternalPreprocess.g:6027:22: ( ( '0' .. '9' )+ RULE_SKW_DOT ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | RULE_SKW_DOT ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ ( RULE_EXPONENT )? RULE_FLOAT_TYPE_SUFFIX )
            int alt30=4;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalPreprocess.g:6027:23: ( '0' .. '9' )+ RULE_SKW_DOT ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    // InternalPreprocess.g:6027:23: ( '0' .. '9' )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalPreprocess.g:6027:24: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    mRULE_SKW_DOT(); 
                    // InternalPreprocess.g:6027:48: ( '0' .. '9' )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalPreprocess.g:6027:49: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    // InternalPreprocess.g:6027:60: ( RULE_EXPONENT )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='E'||LA21_0=='e') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalPreprocess.g:6027:60: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    // InternalPreprocess.g:6027:75: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='D'||LA22_0=='F'||LA22_0=='d'||LA22_0=='f') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalPreprocess.g:6027:75: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalPreprocess.g:6027:99: RULE_SKW_DOT ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    mRULE_SKW_DOT(); 
                    // InternalPreprocess.g:6027:112: ( '0' .. '9' )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalPreprocess.g:6027:113: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    // InternalPreprocess.g:6027:124: ( RULE_EXPONENT )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='E'||LA24_0=='e') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalPreprocess.g:6027:124: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }

                    // InternalPreprocess.g:6027:139: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='D'||LA25_0=='F'||LA25_0=='d'||LA25_0=='f') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalPreprocess.g:6027:139: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalPreprocess.g:6027:163: ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )?
                    {
                    // InternalPreprocess.g:6027:163: ( '0' .. '9' )+
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
                    	    // InternalPreprocess.g:6027:164: '0' .. '9'
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

                    mRULE_EXPONENT(); 
                    // InternalPreprocess.g:6027:189: ( RULE_FLOAT_TYPE_SUFFIX )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='D'||LA27_0=='F'||LA27_0=='d'||LA27_0=='f') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalPreprocess.g:6027:189: RULE_FLOAT_TYPE_SUFFIX
                            {
                            mRULE_FLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalPreprocess.g:6027:213: ( '0' .. '9' )+ ( RULE_EXPONENT )? RULE_FLOAT_TYPE_SUFFIX
                    {
                    // InternalPreprocess.g:6027:213: ( '0' .. '9' )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>='0' && LA28_0<='9')) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalPreprocess.g:6027:214: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    // InternalPreprocess.g:6027:225: ( RULE_EXPONENT )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='E'||LA29_0=='e') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalPreprocess.g:6027:225: RULE_EXPONENT
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
            // InternalPreprocess.g:6029:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // InternalPreprocess.g:6029:26: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPreprocess.g:6029:36: ( '+' | '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='+'||LA31_0=='-') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPreprocess.g:
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

            // InternalPreprocess.g:6029:47: ( '0' .. '9' )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='0' && LA32_0<='9')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPreprocess.g:6029:48: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
            // InternalPreprocess.g:6031:33: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // InternalPreprocess.g:6031:35: ( 'f' | 'F' | 'd' | 'D' )
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
            // InternalPreprocess.g:6033:31: ( ( RULE_SKW_BACKSLASH ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) | RULE_OCTAL_ESCAPE | RULE_HEX_ESCAPE ) )
            // InternalPreprocess.g:6033:33: ( RULE_SKW_BACKSLASH ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) | RULE_OCTAL_ESCAPE | RULE_HEX_ESCAPE )
            {
            // InternalPreprocess.g:6033:33: ( RULE_SKW_BACKSLASH ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH ) | RULE_OCTAL_ESCAPE | RULE_HEX_ESCAPE )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\\') ) {
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
                    alt33=2;
                    }
                    break;
                case 'x':
                    {
                    alt33=3;
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
                    alt33=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalPreprocess.g:6033:34: RULE_SKW_BACKSLASH ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | RULE_SKW_SINGLEQUOTE | RULE_SKW_BACKSLASH )
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
                    // InternalPreprocess.g:6033:119: RULE_OCTAL_ESCAPE
                    {
                    mRULE_OCTAL_ESCAPE(); 

                    }
                    break;
                case 3 :
                    // InternalPreprocess.g:6033:137: RULE_HEX_ESCAPE
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
            // InternalPreprocess.g:6035:28: ( ( RULE_SKW_BACKSLASH '0' .. '3' '0' .. '7' '0' .. '7' | RULE_SKW_BACKSLASH '0' .. '7' '0' .. '7' | RULE_SKW_BACKSLASH '0' .. '7' ) )
            // InternalPreprocess.g:6035:30: ( RULE_SKW_BACKSLASH '0' .. '3' '0' .. '7' '0' .. '7' | RULE_SKW_BACKSLASH '0' .. '7' '0' .. '7' | RULE_SKW_BACKSLASH '0' .. '7' )
            {
            // InternalPreprocess.g:6035:30: ( RULE_SKW_BACKSLASH '0' .. '3' '0' .. '7' '0' .. '7' | RULE_SKW_BACKSLASH '0' .. '7' '0' .. '7' | RULE_SKW_BACKSLASH '0' .. '7' )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\\') ) {
                int LA34_1 = input.LA(2);

                if ( ((LA34_1>='0' && LA34_1<='3')) ) {
                    int LA34_2 = input.LA(3);

                    if ( ((LA34_2>='0' && LA34_2<='7')) ) {
                        int LA34_4 = input.LA(4);

                        if ( ((LA34_4>='0' && LA34_4<='7')) ) {
                            alt34=1;
                        }
                        else {
                            alt34=2;}
                    }
                    else {
                        alt34=3;}
                }
                else if ( ((LA34_1>='4' && LA34_1<='7')) ) {
                    int LA34_3 = input.LA(3);

                    if ( ((LA34_3>='0' && LA34_3<='7')) ) {
                        alt34=2;
                    }
                    else {
                        alt34=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalPreprocess.g:6035:31: RULE_SKW_BACKSLASH '0' .. '3' '0' .. '7' '0' .. '7'
                    {
                    mRULE_SKW_BACKSLASH(); 
                    matchRange('0','3'); 
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 2 :
                    // InternalPreprocess.g:6035:77: RULE_SKW_BACKSLASH '0' .. '7' '0' .. '7'
                    {
                    mRULE_SKW_BACKSLASH(); 
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 3 :
                    // InternalPreprocess.g:6035:114: RULE_SKW_BACKSLASH '0' .. '7'
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
            // InternalPreprocess.g:6037:26: ( RULE_SKW_BACKSLASH 'x' ( RULE_HEX_DIGIT )+ )
            // InternalPreprocess.g:6037:28: RULE_SKW_BACKSLASH 'x' ( RULE_HEX_DIGIT )+
            {
            mRULE_SKW_BACKSLASH(); 
            match('x'); 
            // InternalPreprocess.g:6037:51: ( RULE_HEX_DIGIT )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='0' && LA35_0<='9')||(LA35_0>='A' && LA35_0<='F')||(LA35_0>='a' && LA35_0<='f')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPreprocess.g:6037:51: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

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
    // $ANTLR end "RULE_HEX_ESCAPE"

    // $ANTLR start "RULE_LINEFEED"
    public final void mRULE_LINEFEED() throws RecognitionException {
        try {
            // InternalPreprocess.g:6039:24: ( '\\n' )
            // InternalPreprocess.g:6039:26: '\\n'
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
            // InternalPreprocess.g:6041:30: ( '\\r' )
            // InternalPreprocess.g:6041:32: '\\r'
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
            // InternalPreprocess.g:6043:24: ( ( RULE_CARRIAGERETURN | RULE_LINEFEED ) )
            // InternalPreprocess.g:6043:26: ( RULE_CARRIAGERETURN | RULE_LINEFEED )
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
            // InternalPreprocess.g:6045:25: ( RULE_SKW_BACKSLASH RULE_LINE_END )
            // InternalPreprocess.g:6045:27: RULE_SKW_BACKSLASH RULE_LINE_END
            {
            mRULE_SKW_BACKSLASH(); 
            mRULE_LINE_END(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINEBREAK"

    // $ANTLR start "SUPER_NEWLINE"
    public final void mSUPER_NEWLINE() throws RecognitionException {
        try {
            // InternalPreprocess.g:6047:24: ( RULE_LINE_END )
            // InternalPreprocess.g:6047:26: RULE_LINE_END
            {
            mRULE_LINE_END(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "SUPER_NEWLINE"

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            // InternalPreprocess.g:6049:21: ( ' ' )
            // InternalPreprocess.g:6049:23: ' '
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
            // InternalPreprocess.g:6051:19: ( '\\t' )
            // InternalPreprocess.g:6051:21: '\\t'
            {
            match('\t'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAB"

    // $ANTLR start "RULE_WHITESPACE"
    public final void mRULE_WHITESPACE() throws RecognitionException {
        try {
            int _type = RULE_WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPreprocess.g:6053:17: ( ( RULE_SPACE | RULE_TAB ) )
            // InternalPreprocess.g:6053:19: ( RULE_SPACE | RULE_TAB )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHITESPACE"

    // $ANTLR start "RULE_BLOCK_COMMENT"
    public final void mRULE_BLOCK_COMMENT() throws RecognitionException {
        try {
            // InternalPreprocess.g:6055:29: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPreprocess.g:6055:31: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPreprocess.g:6055:36: ( options {greedy=false; } : . )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0=='*') ) {
                    int LA36_1 = input.LA(2);

                    if ( (LA36_1=='/') ) {
                        alt36=2;
                    }
                    else if ( ((LA36_1>='\u0000' && LA36_1<='.')||(LA36_1>='0' && LA36_1<='\uFFFF')) ) {
                        alt36=1;
                    }


                }
                else if ( ((LA36_0>='\u0000' && LA36_0<=')')||(LA36_0>='+' && LA36_0<='\uFFFF')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPreprocess.g:6055:64: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop36;
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
            // InternalPreprocess.g:6057:28: ( '//' (~ ( RULE_LINE_END ) )* )
            // InternalPreprocess.g:6057:30: '//' (~ ( RULE_LINE_END ) )*
            {
            match("//"); 

            // InternalPreprocess.g:6057:35: (~ ( RULE_LINE_END ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='\u0000' && LA37_0<='\t')||(LA37_0>='\u000B' && LA37_0<='\f')||(LA37_0>='\u000E' && LA37_0<='\uFFFF')) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPreprocess.g:6057:35: ~ ( RULE_LINE_END )
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
            	    break loop37;
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
            // InternalPreprocess.g:6059:25: ( '\\f' )
            // InternalPreprocess.g:6059:27: '\\f'
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
            // InternalPreprocess.g:6061:14: ( ( RULE_LINEBREAK | RULE_BLOCK_COMMENT | RULE_LINE_COMMENT | RULE_FORM_FEED ) )
            // InternalPreprocess.g:6061:16: ( RULE_LINEBREAK | RULE_BLOCK_COMMENT | RULE_LINE_COMMENT | RULE_FORM_FEED )
            {
            // InternalPreprocess.g:6061:16: ( RULE_LINEBREAK | RULE_BLOCK_COMMENT | RULE_LINE_COMMENT | RULE_FORM_FEED )
            int alt38=4;
            switch ( input.LA(1) ) {
            case '\\':
                {
                alt38=1;
                }
                break;
            case '/':
                {
                int LA38_2 = input.LA(2);

                if ( (LA38_2=='*') ) {
                    alt38=2;
                }
                else if ( (LA38_2=='/') ) {
                    alt38=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }
                }
                break;
            case '\f':
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalPreprocess.g:6061:17: RULE_LINEBREAK
                    {
                    mRULE_LINEBREAK(); 

                    }
                    break;
                case 2 :
                    // InternalPreprocess.g:6061:32: RULE_BLOCK_COMMENT
                    {
                    mRULE_BLOCK_COMMENT(); 

                    }
                    break;
                case 3 :
                    // InternalPreprocess.g:6061:51: RULE_LINE_COMMENT
                    {
                    mRULE_LINE_COMMENT(); 

                    }
                    break;
                case 4 :
                    // InternalPreprocess.g:6061:69: RULE_FORM_FEED
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
            // InternalPreprocess.g:6063:14: ( . )
            // InternalPreprocess.g:6063:16: .
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
        // InternalPreprocess.g:1:8: ( RULE_HASH | RULE_INCLUDE | RULE_INCLUDE_NEXT | RULE_DEFINE | RULE_LINE | RULE_ERROR | RULE_WARNING | RULE_UNDEF | RULE_IF | RULE_DEFINED | RULE_IFDEF | RULE_IFNOTDEF | RULE_ELIF | RULE_ELSE | RULE_ENDIF | RULE_PRAGMA | RULE_VA_ARGS | RULE_NEWLINE | RULE_SKW_AND | RULE_SKW_ANDAND | RULE_SKW_ASSIGN | RULE_SKW_BACKSLASH | RULE_SKW_CARET | RULE_SKW_COMMA | RULE_SKW_COLON | RULE_SKW_DIV | RULE_SKW_DOT | RULE_SKW_DOUBLEQUOTE | RULE_SKW_EQUAL | RULE_SKW_GREATER | RULE_SKW_GREATEREQUAL | RULE_SKW_LEFTBRACE | RULE_SKW_LEFTBRACKET | RULE_SKW_LEFTPAREN | RULE_SKW_LEFTSHIFT | RULE_SKW_LESS | RULE_SKW_LESSEQUAL | RULE_SKW_MINUS | RULE_SKW_MINUSMINUS | RULE_SKW_MOD | RULE_SKW_NOT | RULE_SKW_NOTEQUAL | RULE_SKW_OR | RULE_SKW_OROR | RULE_SKW_PLUS | RULE_SKW_PLUSPLUS | RULE_SKW_QUESTION | RULE_SKW_RIGHTBRACE | RULE_SKW_RIGHTBRACKET | RULE_SKW_RIGHTPAREN | RULE_SKW_RIGHTSHIFT | RULE_SKW_SEMI | RULE_SKW_SINGLEQUOTE | RULE_SKW_STAR | RULE_SKW_TILDE | RULE_ID | RULE_CHAR_LITERAL | RULE_STRING_LITERAL | RULE_HEX_LITERAL | RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_BIN_LITERAL | RULE_FLOAT_LITERAL | RULE_WHITESPACE | RULE_IGNORED | RULE_SPECIAL )
        int alt39=66;
        alt39 = dfa39.predict(input);
        switch (alt39) {
            case 1 :
                // InternalPreprocess.g:1:10: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 2 :
                // InternalPreprocess.g:1:20: RULE_INCLUDE
                {
                mRULE_INCLUDE(); 

                }
                break;
            case 3 :
                // InternalPreprocess.g:1:33: RULE_INCLUDE_NEXT
                {
                mRULE_INCLUDE_NEXT(); 

                }
                break;
            case 4 :
                // InternalPreprocess.g:1:51: RULE_DEFINE
                {
                mRULE_DEFINE(); 

                }
                break;
            case 5 :
                // InternalPreprocess.g:1:63: RULE_LINE
                {
                mRULE_LINE(); 

                }
                break;
            case 6 :
                // InternalPreprocess.g:1:73: RULE_ERROR
                {
                mRULE_ERROR(); 

                }
                break;
            case 7 :
                // InternalPreprocess.g:1:84: RULE_WARNING
                {
                mRULE_WARNING(); 

                }
                break;
            case 8 :
                // InternalPreprocess.g:1:97: RULE_UNDEF
                {
                mRULE_UNDEF(); 

                }
                break;
            case 9 :
                // InternalPreprocess.g:1:108: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 10 :
                // InternalPreprocess.g:1:116: RULE_DEFINED
                {
                mRULE_DEFINED(); 

                }
                break;
            case 11 :
                // InternalPreprocess.g:1:129: RULE_IFDEF
                {
                mRULE_IFDEF(); 

                }
                break;
            case 12 :
                // InternalPreprocess.g:1:140: RULE_IFNOTDEF
                {
                mRULE_IFNOTDEF(); 

                }
                break;
            case 13 :
                // InternalPreprocess.g:1:154: RULE_ELIF
                {
                mRULE_ELIF(); 

                }
                break;
            case 14 :
                // InternalPreprocess.g:1:164: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 15 :
                // InternalPreprocess.g:1:174: RULE_ENDIF
                {
                mRULE_ENDIF(); 

                }
                break;
            case 16 :
                // InternalPreprocess.g:1:185: RULE_PRAGMA
                {
                mRULE_PRAGMA(); 

                }
                break;
            case 17 :
                // InternalPreprocess.g:1:197: RULE_VA_ARGS
                {
                mRULE_VA_ARGS(); 

                }
                break;
            case 18 :
                // InternalPreprocess.g:1:210: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 19 :
                // InternalPreprocess.g:1:223: RULE_SKW_AND
                {
                mRULE_SKW_AND(); 

                }
                break;
            case 20 :
                // InternalPreprocess.g:1:236: RULE_SKW_ANDAND
                {
                mRULE_SKW_ANDAND(); 

                }
                break;
            case 21 :
                // InternalPreprocess.g:1:252: RULE_SKW_ASSIGN
                {
                mRULE_SKW_ASSIGN(); 

                }
                break;
            case 22 :
                // InternalPreprocess.g:1:268: RULE_SKW_BACKSLASH
                {
                mRULE_SKW_BACKSLASH(); 

                }
                break;
            case 23 :
                // InternalPreprocess.g:1:287: RULE_SKW_CARET
                {
                mRULE_SKW_CARET(); 

                }
                break;
            case 24 :
                // InternalPreprocess.g:1:302: RULE_SKW_COMMA
                {
                mRULE_SKW_COMMA(); 

                }
                break;
            case 25 :
                // InternalPreprocess.g:1:317: RULE_SKW_COLON
                {
                mRULE_SKW_COLON(); 

                }
                break;
            case 26 :
                // InternalPreprocess.g:1:332: RULE_SKW_DIV
                {
                mRULE_SKW_DIV(); 

                }
                break;
            case 27 :
                // InternalPreprocess.g:1:345: RULE_SKW_DOT
                {
                mRULE_SKW_DOT(); 

                }
                break;
            case 28 :
                // InternalPreprocess.g:1:358: RULE_SKW_DOUBLEQUOTE
                {
                mRULE_SKW_DOUBLEQUOTE(); 

                }
                break;
            case 29 :
                // InternalPreprocess.g:1:379: RULE_SKW_EQUAL
                {
                mRULE_SKW_EQUAL(); 

                }
                break;
            case 30 :
                // InternalPreprocess.g:1:394: RULE_SKW_GREATER
                {
                mRULE_SKW_GREATER(); 

                }
                break;
            case 31 :
                // InternalPreprocess.g:1:411: RULE_SKW_GREATEREQUAL
                {
                mRULE_SKW_GREATEREQUAL(); 

                }
                break;
            case 32 :
                // InternalPreprocess.g:1:433: RULE_SKW_LEFTBRACE
                {
                mRULE_SKW_LEFTBRACE(); 

                }
                break;
            case 33 :
                // InternalPreprocess.g:1:452: RULE_SKW_LEFTBRACKET
                {
                mRULE_SKW_LEFTBRACKET(); 

                }
                break;
            case 34 :
                // InternalPreprocess.g:1:473: RULE_SKW_LEFTPAREN
                {
                mRULE_SKW_LEFTPAREN(); 

                }
                break;
            case 35 :
                // InternalPreprocess.g:1:492: RULE_SKW_LEFTSHIFT
                {
                mRULE_SKW_LEFTSHIFT(); 

                }
                break;
            case 36 :
                // InternalPreprocess.g:1:511: RULE_SKW_LESS
                {
                mRULE_SKW_LESS(); 

                }
                break;
            case 37 :
                // InternalPreprocess.g:1:525: RULE_SKW_LESSEQUAL
                {
                mRULE_SKW_LESSEQUAL(); 

                }
                break;
            case 38 :
                // InternalPreprocess.g:1:544: RULE_SKW_MINUS
                {
                mRULE_SKW_MINUS(); 

                }
                break;
            case 39 :
                // InternalPreprocess.g:1:559: RULE_SKW_MINUSMINUS
                {
                mRULE_SKW_MINUSMINUS(); 

                }
                break;
            case 40 :
                // InternalPreprocess.g:1:579: RULE_SKW_MOD
                {
                mRULE_SKW_MOD(); 

                }
                break;
            case 41 :
                // InternalPreprocess.g:1:592: RULE_SKW_NOT
                {
                mRULE_SKW_NOT(); 

                }
                break;
            case 42 :
                // InternalPreprocess.g:1:605: RULE_SKW_NOTEQUAL
                {
                mRULE_SKW_NOTEQUAL(); 

                }
                break;
            case 43 :
                // InternalPreprocess.g:1:623: RULE_SKW_OR
                {
                mRULE_SKW_OR(); 

                }
                break;
            case 44 :
                // InternalPreprocess.g:1:635: RULE_SKW_OROR
                {
                mRULE_SKW_OROR(); 

                }
                break;
            case 45 :
                // InternalPreprocess.g:1:649: RULE_SKW_PLUS
                {
                mRULE_SKW_PLUS(); 

                }
                break;
            case 46 :
                // InternalPreprocess.g:1:663: RULE_SKW_PLUSPLUS
                {
                mRULE_SKW_PLUSPLUS(); 

                }
                break;
            case 47 :
                // InternalPreprocess.g:1:681: RULE_SKW_QUESTION
                {
                mRULE_SKW_QUESTION(); 

                }
                break;
            case 48 :
                // InternalPreprocess.g:1:699: RULE_SKW_RIGHTBRACE
                {
                mRULE_SKW_RIGHTBRACE(); 

                }
                break;
            case 49 :
                // InternalPreprocess.g:1:719: RULE_SKW_RIGHTBRACKET
                {
                mRULE_SKW_RIGHTBRACKET(); 

                }
                break;
            case 50 :
                // InternalPreprocess.g:1:741: RULE_SKW_RIGHTPAREN
                {
                mRULE_SKW_RIGHTPAREN(); 

                }
                break;
            case 51 :
                // InternalPreprocess.g:1:761: RULE_SKW_RIGHTSHIFT
                {
                mRULE_SKW_RIGHTSHIFT(); 

                }
                break;
            case 52 :
                // InternalPreprocess.g:1:781: RULE_SKW_SEMI
                {
                mRULE_SKW_SEMI(); 

                }
                break;
            case 53 :
                // InternalPreprocess.g:1:795: RULE_SKW_SINGLEQUOTE
                {
                mRULE_SKW_SINGLEQUOTE(); 

                }
                break;
            case 54 :
                // InternalPreprocess.g:1:816: RULE_SKW_STAR
                {
                mRULE_SKW_STAR(); 

                }
                break;
            case 55 :
                // InternalPreprocess.g:1:830: RULE_SKW_TILDE
                {
                mRULE_SKW_TILDE(); 

                }
                break;
            case 56 :
                // InternalPreprocess.g:1:845: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 57 :
                // InternalPreprocess.g:1:853: RULE_CHAR_LITERAL
                {
                mRULE_CHAR_LITERAL(); 

                }
                break;
            case 58 :
                // InternalPreprocess.g:1:871: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 59 :
                // InternalPreprocess.g:1:891: RULE_HEX_LITERAL
                {
                mRULE_HEX_LITERAL(); 

                }
                break;
            case 60 :
                // InternalPreprocess.g:1:908: RULE_DECIMAL_LITERAL
                {
                mRULE_DECIMAL_LITERAL(); 

                }
                break;
            case 61 :
                // InternalPreprocess.g:1:929: RULE_OCTAL_LITERAL
                {
                mRULE_OCTAL_LITERAL(); 

                }
                break;
            case 62 :
                // InternalPreprocess.g:1:948: RULE_BIN_LITERAL
                {
                mRULE_BIN_LITERAL(); 

                }
                break;
            case 63 :
                // InternalPreprocess.g:1:965: RULE_FLOAT_LITERAL
                {
                mRULE_FLOAT_LITERAL(); 

                }
                break;
            case 64 :
                // InternalPreprocess.g:1:984: RULE_WHITESPACE
                {
                mRULE_WHITESPACE(); 

                }
                break;
            case 65 :
                // InternalPreprocess.g:1:1000: RULE_IGNORED
                {
                mRULE_IGNORED(); 

                }
                break;
            case 66 :
                // InternalPreprocess.g:1:1013: RULE_SPECIAL
                {
                mRULE_SPECIAL(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA39 dfa39 = new DFA39(this);
    static final String DFA17_eotS =
        "\1\uffff\1\4\2\10\1\uffff\2\4\3\uffff";
    static final String DFA17_eofS =
        "\12\uffff";
    static final String DFA17_minS =
        "\2\114\1\154\1\114\1\uffff\1\154\1\114\3\uffff";
    static final String DFA17_maxS =
        "\1\165\2\154\1\114\1\uffff\1\154\1\114\3\uffff";
    static final String DFA17_acceptS =
        "\4\uffff\1\1\2\uffff\1\4\1\3\1\2";
    static final String DFA17_specialS =
        "\12\uffff}>";
    static final String[] DFA17_transitionS = {
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "6019:37: ( RULE_UNSIGNED_SUFFIX ( RULE_LONG_SUFFIX )? | RULE_UNSIGNED_SUFFIX RULE_LONG_LONG_SUFFIX | RULE_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? | RULE_LONG_LONG_SUFFIX ( RULE_UNSIGNED_SUFFIX )? )";
        }
    }
    static final String DFA30_eotS =
        "\7\uffff\1\10\2\uffff";
    static final String DFA30_eofS =
        "\12\uffff";
    static final String DFA30_minS =
        "\2\56\1\uffff\1\53\2\uffff\2\60\2\uffff";
    static final String DFA30_maxS =
        "\1\71\1\146\1\uffff\1\71\2\uffff\1\71\1\146\2\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\1\2\uffff\2\3";
    static final String DFA30_specialS =
        "\12\uffff}>";
    static final String[] DFA30_transitionS = {
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "6027:22: ( ( '0' .. '9' )+ RULE_SKW_DOT ( '0' .. '9' )* ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | RULE_SKW_DOT ( '0' .. '9' )+ ( RULE_EXPONENT )? ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ RULE_EXPONENT ( RULE_FLOAT_TYPE_SUFFIX )? | ( '0' .. '9' )+ ( RULE_EXPONENT )? RULE_FLOAT_TYPE_SUFFIX )";
        }
    }
    static final String DFA39_eotS =
        "\2\uffff\10\60\1\uffff\1\73\1\75\1\77\3\uffff\1\104\1\105\1\107\1\111\3\uffff\1\117\1\122\1\uffff\1\125\1\127\1\131\5\uffff\1\140\2\uffff\1\60\1\uffff\2\147\4\uffff\1\60\1\155\1\uffff\11\60\54\uffff\1\170\1\uffff\1\147\1\uffff\3\60\1\uffff\12\60\1\uffff\4\60\1\u008a\1\60\1\u008c\1\u008d\6\60\1\u0094\2\60\1\uffff\1\u0097\2\uffff\1\u0098\1\60\1\u009a\3\60\1\uffff\1\u009e\1\u00a0\2\uffff\1\60\1\uffff\1\u00a2\1\60\1\u00a4\1\uffff\1\u00a6\1\uffff\1\u00a7\1\uffff\1\60\1\uffff\1\60\2\uffff\6\60\1\u00b0\1\u00b1\2\uffff";
    static final String DFA39_eofS =
        "\u00b2\uffff";
    static final String DFA39_minS =
        "\1\0\1\uffff\1\146\1\145\1\151\1\154\1\141\1\156\1\162\1\137\1\uffff\1\46\1\75\1\12\3\uffff\1\52\1\60\1\0\1\75\3\uffff\1\74\1\55\1\uffff\1\75\1\174\1\53\5\uffff\1\0\2\uffff\1\47\1\uffff\2\56\4\uffff\1\143\1\44\1\uffff\1\146\1\156\1\162\1\151\1\144\1\162\1\144\1\141\1\126\54\uffff\1\56\1\uffff\1\56\1\uffff\1\154\1\145\1\144\1\uffff\1\151\1\145\1\157\1\146\1\145\1\151\1\156\1\145\1\147\1\101\1\uffff\1\165\1\146\1\145\1\156\1\44\1\162\2\44\1\146\1\151\1\146\1\155\1\137\1\144\1\44\1\146\1\145\1\uffff\1\44\2\uffff\1\44\1\156\1\44\1\141\1\101\1\145\1\uffff\2\44\2\uffff\1\147\1\uffff\1\44\1\122\1\44\1\uffff\1\44\1\uffff\1\44\1\uffff\1\107\1\uffff\1\156\2\uffff\1\123\1\145\1\137\1\170\1\137\1\164\2\44\2\uffff";
    static final String DFA39_maxS =
        "\1\uffff\1\uffff\1\156\1\145\1\151\1\162\1\141\1\156\1\162\1\137\1\uffff\1\46\1\75\1\15\3\uffff\1\57\1\71\1\uffff\1\76\3\uffff\1\75\1\55\1\uffff\1\75\1\174\1\53\5\uffff\1\uffff\2\uffff\1\47\1\uffff\1\170\1\146\4\uffff\1\143\1\172\1\uffff\1\146\1\156\1\162\1\163\1\144\1\162\1\144\1\141\1\126\54\uffff\1\146\1\uffff\1\146\1\uffff\1\154\1\145\1\144\1\uffff\1\151\1\145\1\157\1\146\1\145\1\151\1\156\1\145\1\147\1\101\1\uffff\1\165\1\146\1\145\1\156\1\172\1\162\2\172\1\146\1\151\1\146\1\155\1\137\1\144\1\172\1\146\1\145\1\uffff\1\172\2\uffff\1\172\1\156\1\172\1\141\1\101\1\145\1\uffff\2\172\2\uffff\1\147\1\uffff\1\172\1\122\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\107\1\uffff\1\156\2\uffff\1\123\1\145\1\137\1\170\1\137\1\164\2\172\2\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\10\uffff\1\22\3\uffff\1\27\1\30\1\31\4\uffff\1\40\1\41\1\42\2\uffff\1\50\3\uffff\1\57\1\60\1\61\1\62\1\64\1\uffff\1\66\1\67\1\uffff\1\70\2\uffff\1\100\1\101\1\102\1\1\2\uffff\1\70\11\uffff\1\22\1\23\1\24\1\25\1\35\1\26\1\101\1\27\1\30\1\31\1\32\1\33\1\77\1\34\1\72\1\36\1\37\1\63\1\40\1\41\1\42\1\44\1\45\1\43\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\64\1\65\1\71\1\66\1\67\1\73\1\76\1\uffff\1\74\1\uffff\1\100\3\uffff\1\11\12\uffff\1\75\21\uffff\1\5\1\uffff\1\15\1\16\6\uffff\1\13\2\uffff\1\6\1\17\1\uffff\1\10\3\uffff\1\14\1\uffff\1\4\1\uffff\1\20\1\uffff\1\2\1\uffff\1\12\1\7\10\uffff\1\21\1\3";
    static final String DFA39_specialS =
        "\1\0\22\uffff\1\2\17\uffff\1\1\u008e\uffff}>";
    static final String[] DFA39_transitionS = {
            "\11\54\1\52\1\12\1\54\1\53\1\12\22\54\1\52\1\33\1\23\1\1\1\47\1\32\1\13\1\43\1\27\1\41\1\44\1\35\1\17\1\31\1\22\1\21\1\50\11\51\1\20\1\42\1\30\1\14\1\24\1\36\1\54\13\47\1\46\16\47\1\26\1\15\1\40\1\16\1\11\1\54\3\47\1\3\1\5\3\47\1\2\2\47\1\4\3\47\1\10\4\47\1\7\1\47\1\6\3\47\1\25\1\34\1\37\1\45\uff81\54",
            "",
            "\1\57\7\uffff\1\56",
            "\1\61",
            "\1\62",
            "\1\64\1\uffff\1\65\3\uffff\1\63",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "\1\74",
            "\1\76",
            "\1\100\2\uffff\1\100",
            "",
            "",
            "",
            "\1\100\4\uffff\1\100",
            "\12\106",
            "\0\110",
            "\1\112\1\113",
            "",
            "",
            "",
            "\1\121\1\120",
            "\1\123",
            "",
            "\1\126",
            "\1\130",
            "\1\132",
            "",
            "",
            "",
            "",
            "",
            "\47\141\1\uffff\uffd8\141",
            "",
            "",
            "\1\141",
            "",
            "\1\106\1\uffff\10\146\2\106\10\uffff\1\145\1\uffff\3\106\21\uffff\1\144\11\uffff\1\145\1\uffff\3\106\21\uffff\1\144",
            "\1\106\1\uffff\12\150\12\uffff\3\106\35\uffff\3\106",
            "",
            "",
            "",
            "",
            "\1\152",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\153\11\60\1\154\14\60",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161\11\uffff\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\106\1\uffff\10\146\2\106\12\uffff\3\106\35\uffff\3\106",
            "",
            "\1\106\1\uffff\12\150\12\uffff\3\106\35\uffff\3\106",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u008b",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0099",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u009f\26\60",
            "",
            "",
            "\1\u00a1",
            "",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00a3",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\u00a5\1\uffff\32\60",
            "",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\60\13\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_HASH | RULE_INCLUDE | RULE_INCLUDE_NEXT | RULE_DEFINE | RULE_LINE | RULE_ERROR | RULE_WARNING | RULE_UNDEF | RULE_IF | RULE_DEFINED | RULE_IFDEF | RULE_IFNOTDEF | RULE_ELIF | RULE_ELSE | RULE_ENDIF | RULE_PRAGMA | RULE_VA_ARGS | RULE_NEWLINE | RULE_SKW_AND | RULE_SKW_ANDAND | RULE_SKW_ASSIGN | RULE_SKW_BACKSLASH | RULE_SKW_CARET | RULE_SKW_COMMA | RULE_SKW_COLON | RULE_SKW_DIV | RULE_SKW_DOT | RULE_SKW_DOUBLEQUOTE | RULE_SKW_EQUAL | RULE_SKW_GREATER | RULE_SKW_GREATEREQUAL | RULE_SKW_LEFTBRACE | RULE_SKW_LEFTBRACKET | RULE_SKW_LEFTPAREN | RULE_SKW_LEFTSHIFT | RULE_SKW_LESS | RULE_SKW_LESSEQUAL | RULE_SKW_MINUS | RULE_SKW_MINUSMINUS | RULE_SKW_MOD | RULE_SKW_NOT | RULE_SKW_NOTEQUAL | RULE_SKW_OR | RULE_SKW_OROR | RULE_SKW_PLUS | RULE_SKW_PLUSPLUS | RULE_SKW_QUESTION | RULE_SKW_RIGHTBRACE | RULE_SKW_RIGHTBRACKET | RULE_SKW_RIGHTPAREN | RULE_SKW_RIGHTSHIFT | RULE_SKW_SEMI | RULE_SKW_SINGLEQUOTE | RULE_SKW_STAR | RULE_SKW_TILDE | RULE_ID | RULE_CHAR_LITERAL | RULE_STRING_LITERAL | RULE_HEX_LITERAL | RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_BIN_LITERAL | RULE_FLOAT_LITERAL | RULE_WHITESPACE | RULE_IGNORED | RULE_SPECIAL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_0 = input.LA(1);

                        s = -1;
                        if ( (LA39_0=='#') ) {s = 1;}

                        else if ( (LA39_0=='i') ) {s = 2;}

                        else if ( (LA39_0=='d') ) {s = 3;}

                        else if ( (LA39_0=='l') ) {s = 4;}

                        else if ( (LA39_0=='e') ) {s = 5;}

                        else if ( (LA39_0=='w') ) {s = 6;}

                        else if ( (LA39_0=='u') ) {s = 7;}

                        else if ( (LA39_0=='p') ) {s = 8;}

                        else if ( (LA39_0=='_') ) {s = 9;}

                        else if ( (LA39_0=='\n'||LA39_0=='\r') ) {s = 10;}

                        else if ( (LA39_0=='&') ) {s = 11;}

                        else if ( (LA39_0=='=') ) {s = 12;}

                        else if ( (LA39_0=='\\') ) {s = 13;}

                        else if ( (LA39_0=='^') ) {s = 14;}

                        else if ( (LA39_0==',') ) {s = 15;}

                        else if ( (LA39_0==':') ) {s = 16;}

                        else if ( (LA39_0=='/') ) {s = 17;}

                        else if ( (LA39_0=='.') ) {s = 18;}

                        else if ( (LA39_0=='\"') ) {s = 19;}

                        else if ( (LA39_0=='>') ) {s = 20;}

                        else if ( (LA39_0=='{') ) {s = 21;}

                        else if ( (LA39_0=='[') ) {s = 22;}

                        else if ( (LA39_0=='(') ) {s = 23;}

                        else if ( (LA39_0=='<') ) {s = 24;}

                        else if ( (LA39_0=='-') ) {s = 25;}

                        else if ( (LA39_0=='%') ) {s = 26;}

                        else if ( (LA39_0=='!') ) {s = 27;}

                        else if ( (LA39_0=='|') ) {s = 28;}

                        else if ( (LA39_0=='+') ) {s = 29;}

                        else if ( (LA39_0=='?') ) {s = 30;}

                        else if ( (LA39_0=='}') ) {s = 31;}

                        else if ( (LA39_0==']') ) {s = 32;}

                        else if ( (LA39_0==')') ) {s = 33;}

                        else if ( (LA39_0==';') ) {s = 34;}

                        else if ( (LA39_0=='\'') ) {s = 35;}

                        else if ( (LA39_0=='*') ) {s = 36;}

                        else if ( (LA39_0=='~') ) {s = 37;}

                        else if ( (LA39_0=='L') ) {s = 38;}

                        else if ( (LA39_0=='$'||(LA39_0>='A' && LA39_0<='K')||(LA39_0>='M' && LA39_0<='Z')||(LA39_0>='a' && LA39_0<='c')||(LA39_0>='f' && LA39_0<='h')||(LA39_0>='j' && LA39_0<='k')||(LA39_0>='m' && LA39_0<='o')||(LA39_0>='q' && LA39_0<='t')||LA39_0=='v'||(LA39_0>='x' && LA39_0<='z')) ) {s = 39;}

                        else if ( (LA39_0=='0') ) {s = 40;}

                        else if ( ((LA39_0>='1' && LA39_0<='9')) ) {s = 41;}

                        else if ( (LA39_0=='\t'||LA39_0==' ') ) {s = 42;}

                        else if ( (LA39_0=='\f') ) {s = 43;}

                        else if ( ((LA39_0>='\u0000' && LA39_0<='\b')||LA39_0=='\u000B'||(LA39_0>='\u000E' && LA39_0<='\u001F')||LA39_0=='@'||LA39_0=='`'||(LA39_0>='\u007F' && LA39_0<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_35 = input.LA(1);

                        s = -1;
                        if ( ((LA39_35>='\u0000' && LA39_35<='&')||(LA39_35>='(' && LA39_35<='\uFFFF')) ) {s = 97;}

                        else s = 96;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_19 = input.LA(1);

                        s = -1;
                        if ( ((LA39_19>='\u0000' && LA39_19<='\uFFFF')) ) {s = 72;}

                        else s = 71;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}