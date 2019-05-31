public class Wallet {
    private int wallet;
    private int totalWallet = 100;
    private int wonMoney;

    public void wallet(int wallet) {
        this.wallet = wallet;
        totalWallet = totalWallet - wallet;
    }

    public void setWallet(int w) {
        wallet = w;
        totalWallet = totalWallet - wallet;
    }

    public int getTotalWallet(){
        return totalWallet;
    }
    public void setWonMoney(int w){
        wonMoney = w;
        totalWallet = totalWallet + wonMoney;
    }
    public void setLoseWallet(int w) {
        wallet = w;
        totalWallet = totalWallet - wallet;
    }
}