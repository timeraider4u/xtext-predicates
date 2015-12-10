package at.jku.isse.ecco.kefax.dotconfig.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.jku.isse.ecco.kefax.dotconfig.services.DotconfigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotconfigParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_EQ", "RULE_LOGIC_SYM", "RULE_SL_COMMENT_NOT", "RULE_S_HEX", "RULE_S_INT", "RULE_STRING", "RULE_NLI", "RULE_WSS", "RULE_STR_D", "RULE_STR_S", "RULE_ESC", "RULE_SL_COMMENT"
    };
    public static final int RULE_STRING=10;
    public static final int RULE_S_INT=9;
    public static final int RULE_NLI=11;
    public static final int RULE_STR_D=13;
    public static final int RULE_LOGIC_SYM=6;
    public static final int RULE_SL_COMMENT_NOT=7;
    public static final int RULE_S_HEX=8;
    public static final int RULE_EQ=5;
    public static final int RULE_STR_S=14;
    public static final int RULE_ESC=15;
    public static final int RULE_SYMBOL=4;
    public static final int RULE_SL_COMMENT=16;
    public static final int EOF=-1;
    public static final int RULE_WSS=12;

    // delegates
    // delegators


        public InternalDotconfigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotconfigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotconfigParser.tokenNames; }
    public String getGrammarFileName() { return "../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g"; }



     	private DotconfigGrammarAccess grammarAccess;
     	
        public InternalDotconfigParser(TokenStream input, DotconfigGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DotConfigModel";	
       	}
       	
       	@Override
       	protected DotconfigGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDotConfigModel"
    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:67:1: entryRuleDotConfigModel returns [EObject current=null] : iv_ruleDotConfigModel= ruleDotConfigModel EOF ;
    public final EObject entryRuleDotConfigModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotConfigModel = null;


        try {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:68:2: (iv_ruleDotConfigModel= ruleDotConfigModel EOF )
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:69:2: iv_ruleDotConfigModel= ruleDotConfigModel EOF
            {
             newCompositeNode(grammarAccess.getDotConfigModelRule()); 
            pushFollow(FOLLOW_ruleDotConfigModel_in_entryRuleDotConfigModel75);
            iv_ruleDotConfigModel=ruleDotConfigModel();

            state._fsp--;

             current =iv_ruleDotConfigModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotConfigModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotConfigModel"


    // $ANTLR start "ruleDotConfigModel"
    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:76:1: ruleDotConfigModel returns [EObject current=null] : ( () ( (lv_Configs_1_0= ruleConfig ) )? ( ruleEol ( (lv_Configs_3_0= ruleConfig ) ) )* ( ruleEol )? ) ;
    public final EObject ruleDotConfigModel() throws RecognitionException {
        EObject current = null;

        EObject lv_Configs_1_0 = null;

        EObject lv_Configs_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:79:28: ( ( () ( (lv_Configs_1_0= ruleConfig ) )? ( ruleEol ( (lv_Configs_3_0= ruleConfig ) ) )* ( ruleEol )? ) )
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:80:1: ( () ( (lv_Configs_1_0= ruleConfig ) )? ( ruleEol ( (lv_Configs_3_0= ruleConfig ) ) )* ( ruleEol )? )
            {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:80:1: ( () ( (lv_Configs_1_0= ruleConfig ) )? ( ruleEol ( (lv_Configs_3_0= ruleConfig ) ) )* ( ruleEol )? )
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:80:2: () ( (lv_Configs_1_0= ruleConfig ) )? ( ruleEol ( (lv_Configs_3_0= ruleConfig ) ) )* ( ruleEol )?
            {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:80:2: ()
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDotConfigModelAccess().getDotConfigModelAction_0(),
                        current);
                

            }

            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:86:2: ( (lv_Configs_1_0= ruleConfig ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_SYMBOL||LA1_0==RULE_SL_COMMENT_NOT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:87:1: (lv_Configs_1_0= ruleConfig )
                    {
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:87:1: (lv_Configs_1_0= ruleConfig )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:88:3: lv_Configs_1_0= ruleConfig
                    {
                     
                    	        newCompositeNode(grammarAccess.getDotConfigModelAccess().getConfigsConfigParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConfig_in_ruleDotConfigModel140);
                    lv_Configs_1_0=ruleConfig();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDotConfigModelRule());
                    	        }
                           		add(
                           			current, 
                           			"Configs",
                            		lv_Configs_1_0, 
                            		"Config");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:104:3: ( ruleEol ( (lv_Configs_3_0= ruleConfig ) ) )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:105:5: ruleEol ( (lv_Configs_3_0= ruleConfig ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getDotConfigModelAccess().getEolParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleEol_in_ruleDotConfigModel158);
            	    ruleEol();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:112:1: ( (lv_Configs_3_0= ruleConfig ) )
            	    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:113:1: (lv_Configs_3_0= ruleConfig )
            	    {
            	    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:113:1: (lv_Configs_3_0= ruleConfig )
            	    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:114:3: lv_Configs_3_0= ruleConfig
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotConfigModelAccess().getConfigsConfigParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConfig_in_ruleDotConfigModel178);
            	    lv_Configs_3_0=ruleConfig();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotConfigModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Configs",
            	            		lv_Configs_3_0, 
            	            		"Config");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:130:4: ( ruleEol )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NLI) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:131:5: ruleEol
                    {
                     
                            newCompositeNode(grammarAccess.getDotConfigModelAccess().getEolParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEol_in_ruleDotConfigModel197);
                    ruleEol();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotConfigModel"


    // $ANTLR start "entryRuleConfig"
    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:146:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:147:2: (iv_ruleConfig= ruleConfig EOF )
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:148:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_ruleConfig_in_entryRuleConfig234);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfig244); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:155:1: ruleConfig returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_SYMBOL ) ) this_EQ_2= RULE_EQ ( (lv_v_3_0= rulevalue ) ) ) | ( () ( (lv_name_5_0= RULE_SYMBOL ) ) this_EQ_6= RULE_EQ ( (lv_v_7_0= RULE_LOGIC_SYM ) ) ) | ( () ( (lv_name_9_0= RULE_SL_COMMENT_NOT ) ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_EQ_2=null;
        Token lv_name_5_0=null;
        Token this_EQ_6=null;
        Token lv_v_7_0=null;
        Token lv_name_9_0=null;
        AntlrDatatypeRuleToken lv_v_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:158:28: ( ( ( () ( (lv_name_1_0= RULE_SYMBOL ) ) this_EQ_2= RULE_EQ ( (lv_v_3_0= rulevalue ) ) ) | ( () ( (lv_name_5_0= RULE_SYMBOL ) ) this_EQ_6= RULE_EQ ( (lv_v_7_0= RULE_LOGIC_SYM ) ) ) | ( () ( (lv_name_9_0= RULE_SL_COMMENT_NOT ) ) ) ) )
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:159:1: ( ( () ( (lv_name_1_0= RULE_SYMBOL ) ) this_EQ_2= RULE_EQ ( (lv_v_3_0= rulevalue ) ) ) | ( () ( (lv_name_5_0= RULE_SYMBOL ) ) this_EQ_6= RULE_EQ ( (lv_v_7_0= RULE_LOGIC_SYM ) ) ) | ( () ( (lv_name_9_0= RULE_SL_COMMENT_NOT ) ) ) )
            {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:159:1: ( ( () ( (lv_name_1_0= RULE_SYMBOL ) ) this_EQ_2= RULE_EQ ( (lv_v_3_0= rulevalue ) ) ) | ( () ( (lv_name_5_0= RULE_SYMBOL ) ) this_EQ_6= RULE_EQ ( (lv_v_7_0= RULE_LOGIC_SYM ) ) ) | ( () ( (lv_name_9_0= RULE_SL_COMMENT_NOT ) ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SYMBOL) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_EQ) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==RULE_LOGIC_SYM) ) {
                        alt4=2;
                    }
                    else if ( ((LA4_3>=RULE_S_HEX && LA4_3<=RULE_STRING)) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_SL_COMMENT_NOT) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:159:2: ( () ( (lv_name_1_0= RULE_SYMBOL ) ) this_EQ_2= RULE_EQ ( (lv_v_3_0= rulevalue ) ) )
                    {
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:159:2: ( () ( (lv_name_1_0= RULE_SYMBOL ) ) this_EQ_2= RULE_EQ ( (lv_v_3_0= rulevalue ) ) )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:159:3: () ( (lv_name_1_0= RULE_SYMBOL ) ) this_EQ_2= RULE_EQ ( (lv_v_3_0= rulevalue ) )
                    {
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:159:3: ()
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:160:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConfigAccess().getConfigStringAction_0_0(),
                                current);
                        

                    }

                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:165:2: ( (lv_name_1_0= RULE_SYMBOL ) )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:166:1: (lv_name_1_0= RULE_SYMBOL )
                    {
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:166:1: (lv_name_1_0= RULE_SYMBOL )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:167:3: lv_name_1_0= RULE_SYMBOL
                    {
                    lv_name_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleConfig296); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getConfigAccess().getNameSYMBOLTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConfigRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"SYMBOL");
                    	    

                    }


                    }

                    this_EQ_2=(Token)match(input,RULE_EQ,FOLLOW_RULE_EQ_in_ruleConfig312); 
                     
                        newLeafNode(this_EQ_2, grammarAccess.getConfigAccess().getEQTerminalRuleCall_0_2()); 
                        
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:187:1: ( (lv_v_3_0= rulevalue ) )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:188:1: (lv_v_3_0= rulevalue )
                    {
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:188:1: (lv_v_3_0= rulevalue )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:189:3: lv_v_3_0= rulevalue
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigAccess().getVValueParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_in_ruleConfig332);
                    lv_v_3_0=rulevalue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigRule());
                    	        }
                           		set(
                           			current, 
                           			"v",
                            		lv_v_3_0, 
                            		"value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:206:6: ( () ( (lv_name_5_0= RULE_SYMBOL ) ) this_EQ_6= RULE_EQ ( (lv_v_7_0= RULE_LOGIC_SYM ) ) )
                    {
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:206:6: ( () ( (lv_name_5_0= RULE_SYMBOL ) ) this_EQ_6= RULE_EQ ( (lv_v_7_0= RULE_LOGIC_SYM ) ) )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:206:7: () ( (lv_name_5_0= RULE_SYMBOL ) ) this_EQ_6= RULE_EQ ( (lv_v_7_0= RULE_LOGIC_SYM ) )
                    {
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:206:7: ()
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:207:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConfigAccess().getConfigLogicAction_1_0(),
                                current);
                        

                    }

                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:212:2: ( (lv_name_5_0= RULE_SYMBOL ) )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:213:1: (lv_name_5_0= RULE_SYMBOL )
                    {
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:213:1: (lv_name_5_0= RULE_SYMBOL )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:214:3: lv_name_5_0= RULE_SYMBOL
                    {
                    lv_name_5_0=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleConfig366); 

                    			newLeafNode(lv_name_5_0, grammarAccess.getConfigAccess().getNameSYMBOLTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConfigRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"SYMBOL");
                    	    

                    }


                    }

                    this_EQ_6=(Token)match(input,RULE_EQ,FOLLOW_RULE_EQ_in_ruleConfig382); 
                     
                        newLeafNode(this_EQ_6, grammarAccess.getConfigAccess().getEQTerminalRuleCall_1_2()); 
                        
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:234:1: ( (lv_v_7_0= RULE_LOGIC_SYM ) )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:235:1: (lv_v_7_0= RULE_LOGIC_SYM )
                    {
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:235:1: (lv_v_7_0= RULE_LOGIC_SYM )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:236:3: lv_v_7_0= RULE_LOGIC_SYM
                    {
                    lv_v_7_0=(Token)match(input,RULE_LOGIC_SYM,FOLLOW_RULE_LOGIC_SYM_in_ruleConfig398); 

                    			newLeafNode(lv_v_7_0, grammarAccess.getConfigAccess().getVLOGIC_SYMTerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConfigRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"v",
                            		lv_v_7_0, 
                            		"LOGIC_SYM");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:253:6: ( () ( (lv_name_9_0= RULE_SL_COMMENT_NOT ) ) )
                    {
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:253:6: ( () ( (lv_name_9_0= RULE_SL_COMMENT_NOT ) ) )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:253:7: () ( (lv_name_9_0= RULE_SL_COMMENT_NOT ) )
                    {
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:253:7: ()
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:254:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConfigAccess().getConfigLogicAction_2_0(),
                                current);
                        

                    }

                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:259:2: ( (lv_name_9_0= RULE_SL_COMMENT_NOT ) )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:260:1: (lv_name_9_0= RULE_SL_COMMENT_NOT )
                    {
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:260:1: (lv_name_9_0= RULE_SL_COMMENT_NOT )
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:261:3: lv_name_9_0= RULE_SL_COMMENT_NOT
                    {
                    lv_name_9_0=(Token)match(input,RULE_SL_COMMENT_NOT,FOLLOW_RULE_SL_COMMENT_NOT_in_ruleConfig437); 

                    			newLeafNode(lv_name_9_0, grammarAccess.getConfigAccess().getNameSL_COMMENT_NOTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConfigRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_9_0, 
                            		"SL_COMMENT_NOT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRulevalue"
    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:285:1: entryRulevalue returns [String current=null] : iv_rulevalue= rulevalue EOF ;
    public final String entryRulevalue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevalue = null;


        try {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:286:2: (iv_rulevalue= rulevalue EOF )
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:287:2: iv_rulevalue= rulevalue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_rulevalue_in_entryRulevalue480);
            iv_rulevalue=rulevalue();

            state._fsp--;

             current =iv_rulevalue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue491); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue"


    // $ANTLR start "rulevalue"
    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:294:1: rulevalue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_S_HEX_0= RULE_S_HEX | this_S_INT_1= RULE_S_INT | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken rulevalue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_S_HEX_0=null;
        Token this_S_INT_1=null;
        Token this_STRING_2=null;

         enterRule(); 
            
        try {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:297:28: ( (this_S_HEX_0= RULE_S_HEX | this_S_INT_1= RULE_S_INT | this_STRING_2= RULE_STRING ) )
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:298:1: (this_S_HEX_0= RULE_S_HEX | this_S_INT_1= RULE_S_INT | this_STRING_2= RULE_STRING )
            {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:298:1: (this_S_HEX_0= RULE_S_HEX | this_S_INT_1= RULE_S_INT | this_STRING_2= RULE_STRING )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_S_HEX:
                {
                alt5=1;
                }
                break;
            case RULE_S_INT:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:298:6: this_S_HEX_0= RULE_S_HEX
                    {
                    this_S_HEX_0=(Token)match(input,RULE_S_HEX,FOLLOW_RULE_S_HEX_in_rulevalue531); 

                    		current.merge(this_S_HEX_0);
                        
                     
                        newLeafNode(this_S_HEX_0, grammarAccess.getValueAccess().getS_HEXTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:306:10: this_S_INT_1= RULE_S_INT
                    {
                    this_S_INT_1=(Token)match(input,RULE_S_INT,FOLLOW_RULE_S_INT_in_rulevalue557); 

                    		current.merge(this_S_INT_1);
                        
                     
                        newLeafNode(this_S_INT_1, grammarAccess.getValueAccess().getS_INTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:314:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulevalue583); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue"


    // $ANTLR start "entryRuleEol"
    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:329:1: entryRuleEol returns [String current=null] : iv_ruleEol= ruleEol EOF ;
    public final String entryRuleEol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEol = null;


        try {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:330:2: (iv_ruleEol= ruleEol EOF )
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:331:2: iv_ruleEol= ruleEol EOF
            {
             newCompositeNode(grammarAccess.getEolRule()); 
            pushFollow(FOLLOW_ruleEol_in_entryRuleEol629);
            iv_ruleEol=ruleEol();

            state._fsp--;

             current =iv_ruleEol.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEol640); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEol"


    // $ANTLR start "ruleEol"
    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:338:1: ruleEol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NLI_0= RULE_NLI )+ ;
    public final AntlrDatatypeRuleToken ruleEol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NLI_0=null;

         enterRule(); 
            
        try {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:341:28: ( (this_NLI_0= RULE_NLI )+ )
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:342:1: (this_NLI_0= RULE_NLI )+
            {
            // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:342:1: (this_NLI_0= RULE_NLI )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_NLI) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.jku.isse.ecco.kefax.dotconfig/src-gen/at/jku/isse/ecco/kefax/dotconfig/parser/antlr/internal/InternalDotconfig.g:342:6: this_NLI_0= RULE_NLI
            	    {
            	    this_NLI_0=(Token)match(input,RULE_NLI,FOLLOW_RULE_NLI_in_ruleEol680); 

            	    		current.merge(this_NLI_0);
            	        
            	     
            	        newLeafNode(this_NLI_0, grammarAccess.getEolAccess().getNLITerminalRuleCall()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEol"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\2\2\2\uffff";
    static final String DFA2_minS =
        "\1\13\1\4\2\uffff";
    static final String DFA2_maxS =
        "\2\13\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\3\2\uffff\1\3\3\uffff\1\1",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 104:3: ( ruleEol ( (lv_Configs_3_0= ruleConfig ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleDotConfigModel_in_entryRuleDotConfigModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotConfigModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_ruleDotConfigModel140 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleEol_in_ruleDotConfigModel158 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleConfig_in_ruleDotConfigModel178 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleEol_in_ruleDotConfigModel197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfig_in_entryRuleConfig234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfig244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleConfig296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EQ_in_ruleConfig312 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_rulevalue_in_ruleConfig332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleConfig366 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EQ_in_ruleConfig382 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LOGIC_SYM_in_ruleConfig398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_NOT_in_ruleConfig437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_in_entryRulevalue480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_S_HEX_in_rulevalue531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_S_INT_in_rulevalue557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulevalue583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEol_in_entryRuleEol629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEol640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NLI_in_ruleEol680 = new BitSet(new long[]{0x0000000000000802L});

}