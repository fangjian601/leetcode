package me.fangjian.leetcode.string.simplifypath;

import java.util.Stack;

/**
 * Created at 8/3/14
 *
 * https://oj.leetcode.com/problems/simplify-path/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    public String simplifyPath(String path) {
        Stack<String> pathStack = new Stack<String>();
        int i = 0;
        while(i < path.length()){
            if(path.charAt(i) == '/'){
                i++;
                continue;
            }
            if(path.charAt(i) == '.'){
                if(i == path.length() - 1 || path.charAt(i + 1) == '/'){
                    i += 2;
                    continue;
                }
                if(i < path.length() - 1){
                    if(path.charAt(i + 1) == '.' && (i == path.length() - 2 || path.charAt(i + 2) == '/')){
                        i += 3;
                        if(!pathStack.empty()){
                            pathStack.pop();
                        }
                        continue;
                    }
                }
            }
            int start = i;
            do {
                i++;
            } while(i < path.length() && path.charAt(i) != '/');
            pathStack.push(path.substring(start, i));
        }
        StringBuilder sb = new StringBuilder();
        while(!pathStack.empty()){
            String item = pathStack.pop();
            for(int j = item.length() - 1; j >= 0; j--){
                sb.append(item.charAt(j));
            }
            sb.append("/");
        }
        if(sb.length() == 0){
            return "/";
        } else {
            return sb.reverse().toString();
        }
    }
}
