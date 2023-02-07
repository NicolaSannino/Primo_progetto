public class Calculator {
    
    private int n1;
    private int n2;
    
    private String operatore;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public String getOperatore() {
        return operatore;
    }

    public void setOperatore(String operatore) {
        this.operatore = operatore;
    }

    public int somma(){
        return n1 + n2;
    }

    public int sottrazione(){
        return n1 - n2;
    }
    
    public int uguale(){
        int risultato = 0;

        switch (operatore){
            case "+":
                risultato = somma();
                break;

            case "-":
                risultato = sottrazione();
                break;
        }
        
        return 0;
    }
}
