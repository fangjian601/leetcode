package me.fangjian.leetcode.string.wordladder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Queue;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/word-ladder/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public int ladderLength(String start, String end, Set<String> dict) {
        int length = 0;
        Queue<String> words = new LinkedList<String>();
        Set<String> visitedWords = new HashSet<String>();
        words.add(start);
        visitedWords.add(start);
        while(!words.isEmpty()){
            length++;
            int size = words.size();
            while(size > 0){
                String word = words.poll();
                if(word.equals(end)){
                    return length;
                }
                char[] chars = word.toCharArray();
                for(int i = 0; i < word.length(); i++){
                    for(char ch = 'a'; ch <= 'z'; ch++){
                        if(word.charAt(i) != ch){
                            chars[i] = ch;
                            String newWord = new String(chars);
                            if(newWord.equals(end)){
                                return length + 1;
                            }
                            if(dict.contains(newWord) && !visitedWords.contains(newWord)){
                                words.add(newWord);
                                visitedWords.add(newWord);
                            }
                        }
                    }
                    chars[i] = word.charAt(i);
                }
                size--;
            }
        }
        return 0;
    }
}
