class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
        List <Integer> sizes = new ArrayList<>();
        for(String str : strs){
            encoded_string += "" + str.length() + ",";
        }
        encoded_string+="#";
        for(String str : strs){
            encoded_string += str;
        }
        System.out.println(encoded_string);
        return encoded_string;
    }

    public List<String> decode(String str) {
        List <String> decoded_strings = new ArrayList<>();
        int i = 0;
        String size = "";
        List <Integer> sizes = new ArrayList<>();
        while(str.charAt(i) != '#'){
            if(str.charAt(i) == ',') {
                sizes.add(Integer.parseInt(size));
                size = "";
                i++;
                continue;
            } else size += str.charAt(i);
            i++;
        }
        i++;
        
        for(int n : sizes){
            decoded_strings.add(str.substring(i, i+n));
            i+=n;
        }
        
        return decoded_strings;
    }
}
