public class Printer {

    public int sheets;
    public int toner;

    public Printer(){
        this.sheets = 100;
        this.toner = 100;
    }

    public int print(int pages){
        if (this.sheets >= pages) {
            this.sheets = this.sheets - pages;
            for (int i = 0; i < pages; i++){
                this.toner = this.toner - 1;
            }
        }
        return this.sheets;
    }
}

