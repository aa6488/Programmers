import java.util.*;
import java.util.stream.Collectors;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

         
        //런타임에러 
//         List<Integer> arr1 = Arrays.stream(A)
//                                 .boxed()
//                                 .collect(Collectors.toList());
        
//         List<Integer> arr2 = Arrays.stream(B)
//                                 .boxed()
//                                 .collect(Collectors.toList());
//         System.out.println(arr1);
//         System.out.println(arr2);
        
//         Collections.sort(arr1)
//         Collections.reverse(arr1);
//         Collections.sort(arr2);
        
//         System.out.println(arr1);
//         System.out.println(arr2);
//         for(int i=0; i<arr1.size(); i++){
//             answer = answer + (arr1.get(i) * arr2.get(i));
//             System.out.println(arr1.get(i));
//             System.out.println(arr2.get(i));
//         }
        
        // 해설 봄 ㅜ reverse정렬해서 같은 0인덱스부터 추가하는것 대신
        // 그냥 둘다 소트하고 앞에서부터 * 뒤에서부터 하는걸로
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<A.length; i++){
            answer = answer + (A[i] * B[B.length-1-i]);
        }
        
        
        
        
        
        return answer;
    }
}