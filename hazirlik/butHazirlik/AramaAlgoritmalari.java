package hazirlik.butHazirlik;

public class AramaAlgoritmalari {
    public static int lineerSearch(int arananSayi,int[] dizi){
        int index = -1;
        for(int i=0; i<dizi.length; i++){
            if(arananSayi==dizi[i]){
                index = i;
            }
        }
        return index;
    }

    public static int binarySearch(int arananSayi,int[] dizi){
        int minLocation = 0;
        int maxLocation = dizi.length - 1;
        int midLocation;
        int index = -1;
        boolean isFound = false;

        while((!isFound) && (minLocation <= maxLocation)){
            midLocation = (maxLocation + minLocation) /2;

            if (arananSayi == dizi[midLocation]){
                isFound = true;
                index = midLocation;
            }
            else {
                if(arananSayi > dizi[minLocation]){
                    minLocation = midLocation +1;
                }

                else {
                    maxLocation = midLocation -1 ;
                }
            }
        }

        return index;


    }
}
