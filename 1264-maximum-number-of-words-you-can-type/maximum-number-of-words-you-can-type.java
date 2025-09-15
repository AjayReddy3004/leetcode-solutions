class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        for(int i=0;i<words.length;i++){
            String w = words[i];
            boolean type = true;
            for(int j=0;j < brokenLetters.length();j++){
                char broke = brokenLetters.charAt(j);
                if(w.indexOf(broke) != -1){
                    type = false;
                    break;
                } 
            }
            if(type){
                count++;
            }
        }
        return count;
    }
}