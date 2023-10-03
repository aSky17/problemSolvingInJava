public class LC744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';
        char ans = letters(letters,target);
        System.out.println(ans);
    }

    static char letters(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        if(target>=letters[end]){
            return (char) letters[start];
        }


        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(target<letters[mid]){
                end = mid - 1;
            }
            else if(target>=letters[mid]){
                start = mid + 1;
            }

        }
        return (char) letters[start];
    }
}
