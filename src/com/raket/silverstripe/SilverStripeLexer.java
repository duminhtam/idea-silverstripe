/* The following code was generated by JFlex 1.4.3 on 2013-04-16 23:38 */

package com.raket.silverstripe;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.raket.silverstripe.psi.SilverStripeTypes;
import com.raket.silverstripe.psi.SilverStripeTokenType;
import com.intellij.psi.TokenType;
import com.intellij.psi.*;
import com.intellij.psi.xml.*;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.Stack;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2013-04-16 23:38 from the specification file
 * <tt>C:/IdeaProjects/idea-silverstripe/src/com/raket/silverstripe/SilverStripe.flex</tt>
 */
public class SilverStripeLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int SS_IF_STATEMENT = 14;
  public static final int SS_REQUIRE_CONTENT = 32;
  public static final int SS_INCLUDE_VARS = 24;
  public static final int SS_REQUIRE_STATEMENT = 18;
  public static final int SS_VAR = 2;
  public static final int SS_TRANSLATION = 12;
  public static final int SS_SINGLE = 30;
  public static final int SS_BAD_BLOCK_STATEMENT = 8;
  public static final int SS_DOUBLE = 28;
  public static final int SS_IDENTIFIER = 34;
  public static final int SS_STRING = 26;
  public static final int SS_INCLUDE_STATEMENT = 16;
  public static final int SS_METHOD_ARGUMENTS = 20;
  public static final int YYINITIAL = 0;
  public static final int SS_BLOCK_VAR = 6;
  public static final int SS_CACHED_STATEMENT = 22;
  public static final int SS_BLOCK_START = 4;
  public static final int SS_COMMENT = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 
    16, 16, 17, 17
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\41\1\15"+
    "\1\0\1\11\1\21\1\42\1\14\1\5\1\6\2\0\1\4\1\51"+
    "\1\7\1\0\12\10\2\0\1\20\1\40\1\22\2\0\2\13\1\54"+
    "\17\13\1\55\7\13\4\0\1\12\1\0\1\45\1\44\1\32\1\50"+
    "\1\36\1\35\1\46\1\31\1\27\1\56\1\13\1\23\1\53\1\33"+
    "\1\24\1\25\1\52\1\34\1\37\1\30\1\47\1\57\1\26\3\13"+
    "\1\16\1\43\1\17\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\4\0\1\2\10\0\3\3\1\0\3\1\1\4"+
    "\1\5\2\4\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\4\2\14\1\15\12\14\1\16\1\5\1\16\1\17"+
    "\2\16\2\5\1\15\1\16\1\2\1\17\1\20\1\21"+
    "\2\22\1\23\3\16\1\17\2\16\1\24\1\25\3\4"+
    "\1\26\1\27\1\30\3\4\1\3\1\31\1\32\1\3"+
    "\1\33\1\3\1\34\1\35\1\36\1\37\1\40\3\0"+
    "\1\41\11\0\1\42\1\2\1\0\1\37\1\22\1\0"+
    "\1\3\1\0\1\17\1\43\3\0\1\44\13\0\1\2"+
    "\1\45\1\22\1\0\1\46\1\0\1\47\1\50\4\0"+
    "\1\51\2\0\1\52\1\53\20\0\1\54\4\0\1\55"+
    "\5\0\1\56\1\57\1\60\11\0\1\61\4\0\1\62"+
    "\2\0\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[193];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0"+
    "\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u03f0\0\u0420"+
    "\0\u0450\0\u03f0\0\u03f0\0\u0480\0\u04b0\0\u03f0\0\u03f0\0\u04e0"+
    "\0\u03f0\0\u0420\0\u0450\0\u0510\0\u0540\0\u0570\0\u05a0\0\u05d0"+
    "\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0\0\u03f0\0\u0420\0\u06f0"+
    "\0\u0720\0\u04e0\0\u0750\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810"+
    "\0\u0840\0\u03f0\0\u03f0\0\u0870\0\u08a0\0\u0840\0\u08a0\0\u08d0"+
    "\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0\0\u03f0\0\u09f0\0\u0a20"+
    "\0\u0a50\0\u03f0\0\u03f0\0\u0a80\0\u0480\0\u08d0\0\u0900\0\u0ab0"+
    "\0\u03f0\0\u03f0\0\u0ae0\0\u03f0\0\u0b10\0\u0b40\0\u03f0\0\u03f0"+
    "\0\u0b70\0\u03f0\0\u0ba0\0\u0bd0\0\u0c00\0\u03f0\0\u0c30\0\u0c60"+
    "\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0750\0\u07e0\0\u03f0"+
    "\0\u0d80\0\u0db0\0\u03f0\0\u03f0\0\u08d0\0\u03f0\0\u0900\0\u0de0"+
    "\0\u03f0\0\u0e10\0\u0e40\0\u0e70\0\u03f0\0\u0ea0\0\u0ed0\0\u0f00"+
    "\0\u0f30\0\u0f60\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050\0\u1080"+
    "\0\u10b0\0\u0db0\0\u0720\0\u10e0\0\u03f0\0\u1110\0\u03f0\0\u03f0"+
    "\0\u1140\0\u1170\0\u11a0\0\u11d0\0\u1200\0\u1230\0\u1260\0\u03f0"+
    "\0\u03f0\0\u1290\0\u12c0\0\u12f0\0\u1320\0\u1350\0\u1380\0\u13b0"+
    "\0\u13e0\0\u1410\0\u1440\0\u1470\0\u14a0\0\u14d0\0\u1500\0\u1530"+
    "\0\u1560\0\u03f0\0\u1590\0\u15c0\0\u15f0\0\u1620\0\u03f0\0\u1650"+
    "\0\u1680\0\u16b0\0\u16e0\0\u1710\0\u03f0\0\u03f0\0\u03f0\0\u1740"+
    "\0\u1770\0\u17a0\0\u17d0\0\u1800\0\u1830\0\u1860\0\u1890\0\u18c0"+
    "\0\u03f0\0\u18f0\0\u1920\0\u1950\0\u1980\0\u03f0\0\u19b0\0\u19e0"+
    "\0\u03f0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[193];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\11\1\1\23\4\1\1\24\1\1\1\25\37\1\1\26"+
    "\1\27\1\30\1\31\1\26\1\32\1\26\1\33\1\26"+
    "\1\34\2\35\2\26\1\36\1\37\1\26\1\40\1\26"+
    "\15\35\4\26\5\35\1\26\6\35\1\41\1\27\1\42"+
    "\1\43\14\41\1\44\1\45\1\41\1\46\2\41\1\47"+
    "\1\50\2\41\1\51\1\41\1\52\1\41\1\53\5\41"+
    "\1\54\4\41\1\55\6\41\1\56\1\27\1\57\1\43"+
    "\5\56\1\60\2\61\5\56\1\62\1\56\15\61\4\56"+
    "\5\61\1\56\6\61\1\63\1\64\1\65\1\66\15\63"+
    "\1\67\36\63\51\6\1\70\6\6\1\56\1\27\1\57"+
    "\1\43\5\56\1\60\1\61\1\71\1\72\1\73\2\56"+
    "\1\74\1\62\1\75\5\71\1\76\7\71\1\75\1\77"+
    "\2\56\5\71\1\56\6\71\1\56\1\27\1\57\1\43"+
    "\5\56\1\60\2\61\1\100\1\101\2\56\1\75\1\62"+
    "\1\75\10\61\1\102\4\61\1\75\1\77\1\103\1\104"+
    "\5\61\1\56\6\61\1\26\1\27\1\30\1\43\6\26"+
    "\2\105\7\26\15\105\4\26\14\105\1\26\1\27\1\30"+
    "\1\43\1\26\1\106\22\26\1\107\1\26\1\110\23\26"+
    "\1\111\2\26\1\27\1\30\1\43\1\112\1\26\1\113"+
    "\1\33\1\114\1\115\2\35\1\116\1\117\5\26\15\35"+
    "\4\26\5\35\1\26\6\35\1\56\1\27\1\57\1\43"+
    "\1\112\4\56\1\60\2\61\1\100\1\101\3\56\1\62"+
    "\1\56\15\61\4\56\5\61\1\56\6\61\1\56\1\27"+
    "\1\57\1\43\1\112\4\56\1\60\2\61\4\56\1\75"+
    "\1\62\1\75\15\61\1\75\1\77\2\56\5\61\1\56"+
    "\6\61\1\56\1\27\1\57\1\43\54\56\15\120\1\121"+
    "\1\122\41\120\14\123\1\124\1\123\1\122\41\123\6\125"+
    "\1\113\5\125\1\72\1\73\42\125\1\26\1\27\1\30"+
    "\1\31\6\26\2\126\7\26\15\126\4\26\5\126\1\26"+
    "\6\126\11\1\1\23\1\1\1\0\2\1\1\24\1\1"+
    "\1\25\2\1\15\0\4\1\5\0\1\1\6\0\11\1"+
    "\1\0\4\1\1\24\1\1\1\25\50\1\1\23\4\1"+
    "\1\24\1\1\1\25\1\127\36\1\61\0\1\27\61\0"+
    "\1\43\66\0\2\35\7\0\15\35\4\0\5\35\1\0"+
    "\6\35\10\0\1\35\1\0\2\35\7\0\15\35\4\0"+
    "\5\35\1\0\6\35\22\0\1\130\56\0\1\131\60\0"+
    "\1\132\61\0\1\133\62\0\1\134\63\0\1\135\1\0"+
    "\1\136\46\0\1\137\20\0\1\140\50\0\1\141\44\0"+
    "\1\142\7\0\1\143\71\0\1\144\63\0\1\145\20\0"+
    "\2\61\7\0\15\61\4\0\5\61\1\0\6\61\10\0"+
    "\1\61\1\0\2\61\7\0\15\61\4\0\5\61\1\0"+
    "\6\61\21\146\1\147\37\146\1\64\17\146\1\147\41\146"+
    "\1\66\15\146\1\147\57\146\1\147\1\150\35\146\51\6"+
    "\1\151\6\6\7\0\1\152\1\61\1\0\1\61\1\71"+
    "\7\0\15\71\4\0\5\71\1\0\6\71\21\0\1\153"+
    "\16\0\1\154\57\0\1\154\17\0\14\155\1\156\43\155"+
    "\15\157\1\156\42\157\10\0\1\61\1\0\2\61\7\0"+
    "\1\61\1\160\13\61\4\0\5\61\1\0\6\61\42\0"+
    "\1\161\60\0\1\161\26\0\2\105\7\0\15\105\4\0"+
    "\14\105\31\0\1\162\65\0\1\163\65\0\1\164\22\0"+
    "\1\114\47\0\15\120\2\0\41\120\14\123\1\0\1\123"+
    "\1\0\41\123\6\125\1\0\5\125\2\0\42\125\10\0"+
    "\1\126\1\0\2\126\7\0\15\126\4\0\5\126\1\0"+
    "\6\126\30\0\1\165\20\0\1\166\32\0\1\167\63\0"+
    "\1\170\61\0\1\171\60\0\1\172\56\0\1\173\77\0"+
    "\1\174\44\0\1\175\70\0\1\176\46\0\1\177\41\0"+
    "\1\200\36\0\21\6\1\201\27\6\1\151\6\6\13\0"+
    "\1\202\7\0\15\202\4\0\5\202\1\0\6\202\10\0"+
    "\1\61\1\0\2\61\7\0\5\61\1\203\7\61\4\0"+
    "\5\61\1\0\6\61\36\0\1\204\60\0\1\205\77\0"+
    "\1\206\51\0\1\207\33\0\1\210\63\0\1\210\51\0"+
    "\1\211\64\0\1\212\60\0\1\213\75\0\1\214\46\0"+
    "\1\215\33\0\1\216\103\0\1\217\43\0\1\220\35\0"+
    "\22\6\1\221\26\6\1\70\6\6\53\0\1\222\51\0"+
    "\1\223\61\0\1\224\44\0\1\225\61\0\1\226\50\0"+
    "\1\227\42\0\1\230\70\0\1\231\2\0\1\232\1\233"+
    "\2\0\1\234\37\0\1\235\103\0\1\236\60\0\1\237"+
    "\70\0\1\240\33\0\1\241\103\0\1\242\43\0\1\243"+
    "\52\0\1\244\54\0\1\245\62\0\1\246\65\0\1\247"+
    "\46\0\1\250\20\0\1\251\42\0\1\252\77\0\1\253"+
    "\41\0\1\254\63\0\1\255\44\0\1\210\72\0\1\256"+
    "\56\0\1\257\46\0\1\260\63\0\1\261\62\0\1\262"+
    "\56\0\1\263\72\0\1\264\66\0\1\265\37\0\1\266"+
    "\50\0\1\247\63\0\1\247\56\0\1\267\60\0\1\270"+
    "\74\0\1\271\66\0\1\272\31\0\1\273\64\0\1\274"+
    "\61\0\1\275\76\0\1\276\27\0\1\277\56\0\1\300"+
    "\103\0\1\247\37\0\1\301\52\0\1\247\34\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6672];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\4\0\1\1\10\0\3\1\1\0\3\1\2\11"+
    "\2\1\2\11\2\1\2\11\1\1\1\11\14\1\1\11"+
    "\13\1\2\11\12\1\1\11\3\1\2\11\5\1\2\11"+
    "\1\1\1\11\2\1\2\11\1\1\1\11\3\0\1\11"+
    "\11\0\1\11\1\1\1\0\2\11\1\0\1\11\1\0"+
    "\1\1\1\11\3\0\1\11\13\0\3\1\1\0\1\11"+
    "\1\0\2\11\4\0\1\1\2\0\2\11\20\0\1\11"+
    "\4\0\1\11\5\0\3\11\11\0\1\11\4\0\1\11"+
    "\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[193];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Stack<Integer> stack = new Stack<Integer>();

    public void yypushstate(int newState) {
      stack.push(yystate());
      yybegin(newState);
    }

    public void yypopstate() {
      yybegin(stack.pop());
    }

    public void yycleanstates() {
       while(!stack.isEmpty()) {
          yybegin(stack.pop());
       }
    }

	public IElementType checkContent() {
        if (!yytext().toString().equals("")) {
           if (yytext().toString().trim().length() == 0) {
               return TokenType.WHITE_SPACE;
           } else {
               return SilverStripeTypes.CONTENT;
           }
        }
    	return null;
	}


  public SilverStripeLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public SilverStripeLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 128) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 15: 
          { yypushstate(SS_VAR); return SilverStripeTypes.SS_VAR;
          }
        case 52: break;
        case 45: 
          { return SilverStripeTypes.SS_END_KEYWORD;
          }
        case 53: break;
        case 3: 
          { return SilverStripeTypes.SS_STRING;
          }
        case 54: break;
        case 48: 
          { yypushstate(SS_IF_STATEMENT); return SilverStripeTypes.SS_ELSE_IF_KEYWORD;
          }
        case 55: break;
        case 47: 
          { yypushstate(SS_REQUIRE_STATEMENT); return SilverStripeTypes.SS_REQUIRE_KEYWORD;
          }
        case 56: break;
        case 26: 
          { yypushstate(SS_VAR); return SilverStripeTypes.SS_VAR_START_DELIMITER;
          }
        case 57: break;
        case 16: 
          { yypushstate(SS_SINGLE); return SilverStripeTypes.SS_SINGLE_LEFT;
          }
        case 58: break;
        case 49: 
          { yypushstate(SS_BLOCK_VAR); return SilverStripeTypes.SS_SIMPLE_KEYWORD;
          }
        case 59: break;
        case 21: 
          { yypushstate(SS_REQUIRE_CONTENT); return SilverStripeTypes.LEFT_PAREN;
          }
        case 60: break;
        case 18: 
          { return SilverStripeTypes.SS_COMPARISON_OPERATOR;
          }
        case 61: break;
        case 13: 
          { return TokenType.WHITE_SPACE;
          }
        case 62: break;
        case 28: 
          { yypopstate(); return SilverStripeTypes.SS_IDENTIFIER;
          }
        case 63: break;
        case 25: 
          { yypopstate(); return SilverStripeTypes.SS_DOUBLE_RIGHT;
          }
        case 64: break;
        case 5: 
          { if (!stack.isEmpty()) {
		   yypopstate(); yypushback(yylength());
		} else {
		return SilverStripeTypes.CRLF;
	}
          }
        case 65: break;
        case 6: 
          { yypushstate(SS_METHOD_ARGUMENTS); return SilverStripeTypes.LEFT_PAREN;
          }
        case 66: break;
        case 7: 
          { yypushstate(SS_IDENTIFIER); return SilverStripeTypes.DOT;
          }
        case 67: break;
        case 10: 
          { return SilverStripeTypes.SS_VAR_START_DELIMITER;
          }
        case 68: break;
        case 12: 
          { yypushstate(SS_BAD_BLOCK_STATEMENT); yypushback(yylength());
          }
        case 69: break;
        case 23: 
          { yypopstate(); return SilverStripeTypes.RIGHT_PAREN;
          }
        case 70: break;
        case 30: 
          { yycleanstates(); return SilverStripeTypes.SS_BLOCK_END;
          }
        case 71: break;
        case 39: 
          { yypushstate(SS_COMMENT); return SilverStripeTypes.SS_COMMENT_START;
          }
        case 72: break;
        case 8: 
          { return SilverStripeTypes.SS_VAR_START;
          }
        case 73: break;
        case 29: 
          { yypushback(2);
            yypushstate(SS_BLOCK_START);
            IElementType content = checkContent();
            if (content != null) return content;
          }
        case 74: break;
        case 41: 
          { return SilverStripeTypes.SS_ELSE_KEYWORD;
          }
        case 75: break;
        case 32: 
          { yypopstate(); return SilverStripeTypes.SS_BLOCK_END;
          }
        case 76: break;
        case 2: 
          { return SilverStripeTypes.COMMENT;
          }
        case 77: break;
        case 37: 
          { return SilverStripeTypes.SS_TRANSLATION_IDENTIFIER;
          }
        case 78: break;
        case 27: 
          { yypopstate(); return SilverStripeTypes.SS_SINGLE_RIGHT;
          }
        case 79: break;
        case 34: 
          { yypopstate(); yypushback(2); return SilverStripeTypes.SS_BAD_BLOCK_STATEMENT;
          }
        case 80: break;
        case 19: 
          { return SilverStripeTypes.SS_TRANSLATION_KEYWORD;
          }
        case 81: break;
        case 36: 
          { yypushstate(SS_TRANSLATION);  yypushback(3); return SilverStripeTypes.SS_BLOCK_START;
          }
        case 82: break;
        case 20: 
          { yypushstate(SS_INCLUDE_VARS); return SilverStripeTypes.SS_INCLUDE_FILE;
          }
        case 83: break;
        case 9: 
          { return SilverStripeTypes.SS_VAR;
          }
        case 84: break;
        case 44: 
          { yypushstate(SS_CACHED_STATEMENT); return SilverStripeTypes.SS_CACHED_KEYWORD;
          }
        case 85: break;
        case 40: 
          { yypushstate(SS_BLOCK_VAR); return SilverStripeTypes.SS_START_KEYWORD;
          }
        case 86: break;
        case 11: 
          { yypopstate(); return SilverStripeTypes.SS_VAR_END_DELIMITER;
          }
        case 87: break;
        case 17: 
          { yypushstate(SS_DOUBLE); return SilverStripeTypes.SS_DOUBLE_LEFT;
          }
        case 88: break;
        case 4: 
          { yypopstate(); yypushback(yylength());
          }
        case 89: break;
        case 31: 
          { return SilverStripeTypes.SS_BLOCK_START;
          }
        case 90: break;
        case 14: 
          { return TokenType.BAD_CHARACTER;
/*	if (!stack.isEmpty()) {
	   yypopstate(); yypushback(yylength());
	} else {
		return TokenType.BAD_CHARACTER;
	}*/
          }
        case 91: break;
        case 43: 
          { yypopstate(); yypushback(4); return SilverStripeTypes.COMMENT;
          }
        case 92: break;
        case 46: 
          { yypushstate(SS_INCLUDE_STATEMENT); return SilverStripeTypes.SS_INCLUDE_KEYWORD;
          }
        case 93: break;
        case 33: 
          { yypushstate(SS_IF_STATEMENT); return SilverStripeTypes.SS_IF_KEYWORD;
          }
        case 94: break;
        case 1: 
          { if (yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("$") ||
            yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("{") ) {
            yypushback(1);
            yypushstate(SS_VAR);
        }

        // we stray from the Handlebars grammar a bit here since we need our WHITE_SPACE more clearly delineated
        //    and we need to avoid creating extra tokens for empty strings (makes the parser and formatter happier)
        if (!yytext().toString().equals("")) {
           if (yytext().toString().trim().length() == 0) {
               return TokenType.WHITE_SPACE;
           } else {
               return SilverStripeTypes.CONTENT;
           }
        }
          }
        case 95: break;
        case 42: 
          { yypopstate(); return SilverStripeTypes.SS_COMMENT_END;
          }
        case 96: break;
        case 24: 
          { return SilverStripeTypes.NUMBER;
          }
        case 97: break;
        case 50: 
          { return SilverStripeTypes.SS_REQUIRE_THEME_CSS;
          }
        case 98: break;
        case 51: 
          { return SilverStripeTypes.SS_REQUIRE_JS;
          }
        case 99: break;
        case 35: 
          { return SilverStripeTypes.SS_AND_OR_OPERATOR;
          }
        case 100: break;
        case 22: 
          { return SilverStripeTypes.COMMA;
          }
        case 101: break;
        case 38: 
          { return SilverStripeTypes.SS_REQUIRE_CSS;
          }
        case 102: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
