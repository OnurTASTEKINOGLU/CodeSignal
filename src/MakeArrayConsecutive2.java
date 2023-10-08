import java.util.Arrays;

final class MakeArrayConsecutive2 {

    int solution(int[] statues) {

        Arrays.sort(statues);

        int addMissing = 0;
        for(int i = 1;i<statues.length; i++){
            int value = statues[i]-statues[i-1];
            if(value>1){
                addMissing+=value-1;

            }
        }

        return addMissing;




    }

}
