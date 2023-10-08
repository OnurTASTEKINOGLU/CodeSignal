final class CenturyFromYear {

    int solution(int year) {

        if(year <= 100) {
            year =1;
            return year;
        }
        else if(year >100) {
            if(year%100 == 0) {
                year = year/100;
            }else{
                year = year/100 +1;
            }}
        return year;
    }
}
