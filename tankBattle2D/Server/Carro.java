/**
 * classe Carro che gestisce il singolo carroarmato
 */
public class Carro {
    public String letteraCarro = "";
    public String urlCarro = "";
    public int xGiocatore;
    public int yGiocatore;
    public Carro(String _urlCarro, String _letteraCarro, int xIniziale, int yIniziale) {
        this.urlCarro = _urlCarro;
        this.xGiocatore = xIniziale;
        this.yGiocatore = yIniziale;
        this.letteraCarro = _letteraCarro;
    }

    public void muoviCarro(String direzione){
        if(direzione.equals("W")){
            this.yGiocatore-=2;
        }
        else  if(direzione.equals("S")){
            this.yGiocatore+=2;
        }
        else  if(direzione.equals("A")){
            this.xGiocatore-=2;
        }
        else  if(direzione.equals("D")){
            this.xGiocatore+=2;
        }
    }
}

