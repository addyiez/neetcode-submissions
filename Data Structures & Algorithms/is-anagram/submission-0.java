class Solution {
    public boolean isAnagram(String s, String t) {
        // Get Length for each String
        int s_len = s.length();
        int t_len = t.length();
        if (s_len != t_len) {
            return false;
        }

        // Create Hash Table for Both Strings
        Hashtable<Character, Integer> s_table = new Hashtable<>(s_len);
        Hashtable<Character, Integer> t_table = new Hashtable<>(t_len);

        // Loop Though The Strings and Check Frequency for Each Character
        for (int i = 0; i < s_len; i++) {
            Integer freq_s = s_table.get(s.charAt(i));
            if (freq_s != null) {
                s_table.put(s.charAt(i), freq_s + 1);
            } else {
                s_table.put(s.charAt(i), 1);
            }

            Integer freq_t = t_table.get(t.charAt(i));
            if (freq_t != null) {
                t_table.put(t.charAt(i), freq_t + 1);
            } else {
                t_table.put(t.charAt(i), 1);
            }
        }
        System.out.println(s_table);
        System.out.println(t_table);

        // Compare The Similarty of Two HashTable
        return s_table.equals(t_table);


        // Complexity:
        /*
            Time Complexity: O(n + m)
            Space Complexity: O(n + m)

            Where n is lenght of String s and t is lenght of String t
        */
    
    
    }
}
