package dhirendra.february11;
//DOne in one go !
public class TcsXploreQuestion05 {

  public static void main(String[] args) {
    countVowelConsonants("Welcome123");
  }
  private static void countVowelConsonants(String string) {
    int i=0;
    int vowel = 0;
    int consonant = 0;
    while(i<string.length()) {
      switch(string.charAt(i)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
          vowel++;
          break;
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
        case '0':
          break;
        default:
          consonant++;
          break;
      }
      i++;
    }
    System.out.println("VOWEL: "+vowel);
    System.out.println("CONSONANTS: "+consonant);
  }
}
