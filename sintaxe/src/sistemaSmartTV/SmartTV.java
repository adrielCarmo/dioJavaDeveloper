package sistemaSmartTV;

public class SmartTV {
    int volume, canal;
    boolean ligada;
    
    public SmartTV() {
        ligada = false;
        volume = 20;
        canal = 1;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        this.volume++;
    }
    
    public void diminuirVolume() {
        this.volume--;
    }

    public void aumentarCanal() {
        this.canal++;
    }

    public void diminuirCanal() {
        this.canal--;
    }

    public void trocarCanal(int novoCanal) {
        this.canal = novoCanal;
    }
}
