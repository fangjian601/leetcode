package me.fangjian.leetcode.string.substrconcat;

import java.util.*;

/**
 * Created at 8/4/14
 *
 * https://oj.leetcode.com/problems/substring-with-concatenation-of-all-words/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public List<Integer> findSubstring(String S, String[] L) {
        if(S.length() == 0 || L.length == 0) { return new ArrayList<Integer>(); }
        int wordLen = L[0].length();
        LinkedList<Integer> result = new LinkedList<Integer>();
        Map<String, Integer> dict = new HashMap<String, Integer>();
        for(String word : L){
            Integer count = dict.get(word);
            if(count == null){
                count = 1;
            } else {
                count++;
            }
            dict.put(word, count);
        }
        for(int i = 0; i < wordLen; i++){
            Map<String, Integer> tmpDict = new HashMap<String, Integer>();
            int start = i, currentSize = 0;
            for(int j = i; j <= S.length() - wordLen; j += wordLen){
                String word = S.substring(j, j + wordLen);
                if(dict.containsKey(word)){
                    Integer currentCount = tmpDict.get(word);
                    if(currentCount == null){
                        tmpDict.put(word, 1);
                        if(dict.get(word) == 1){
                            currentSize++;
                        }
                    } else {
                        if(currentCount < dict.get(word)){
                            tmpDict.put(word, currentCount + 1);
                            if(currentCount + 1 == dict.get(word)){
                                currentSize++;
                            }
                        } else {
                            while(true){
                                String anotherWord = S.substring(start, start + wordLen);
                                if(anotherWord.equals(word)){
                                    start += wordLen;
                                    break;
                                } else {
                                    Integer anotherCount = tmpDict.get(anotherWord);
                                    if(anotherCount == 1){
                                        tmpDict.remove(anotherWord);
                                    } else {
                                        tmpDict.put(anotherWord, anotherCount - 1);
                                    }
                                }
                                start += wordLen;
                            }
                        }
                    }
                    if(currentSize == dict.size()){
                        result.add(start);
                        Integer anotherCount = tmpDict.get(S.substring(start, start + wordLen));
                        if(anotherCount == 1){
                            tmpDict.remove(S.substring(start, start + wordLen));
                        } else {
                            tmpDict.put(S.substring(start, start + wordLen), anotherCount - 1);
                        }
                        start = start + wordLen;
                        currentSize--;
                    }
                } else {
                    tmpDict.clear();
                    start = j + wordLen;
                    currentSize = 0;
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}
