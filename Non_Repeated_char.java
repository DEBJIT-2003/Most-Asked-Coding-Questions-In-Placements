public class Non_Repeated_char {

        public static void findNonRepeating(String str) {
            int[] freq = new int[256]; // Assuming ASCII characters
    
            // Count frequency of each character
            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i)]++;
            }
    
            // Print characters with frequency 1
            System.out.print("Non-repeating characters: ");
            for (int i = 0; i < str.length(); i++) {
                if (freq[str.charAt(i)] == 1) {
                    System.out.print(str.charAt(i) + " ");
                }
            }
        }
    
        public static void main(String[] args) {
            String input = "programming";
            findNonRepeating(input);
        }
    }
