package com.k21cnt.tvc.lesson02.pkg_tight_loosely;

public class TightCooplingService {
    private BubbleSortAlgoristhm bubbleSortAlgoristhm=new BubbleSortAlgoristhm();
    public TightCooplingService(){}
    public TightCooplingService(BubbleSortAlgoristhm bubbleSortAlgoristhm){
        this.bubbleSortAlgoristhm = bubbleSortAlgoristhm;
    }

    public  void  complexBusiness(int[] array){
        bubbleSortAlgoristhm.sort(array);
    }

    public static void main(String[] args) {
        TightCooplingService service = new TightCooplingService();
        int[] arr = {1,2,34,55};
        service.complexBusiness(arr);
    }
}
