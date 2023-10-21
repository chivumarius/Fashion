package com.chivumarius.fashion;




public class row {
   
    // ▼ "VARIABLES" DECLARATION ▼
    private int img;
    private String title;




    // ▬ "CONSTRUCTOR" ▬
    public row(int img, String title) {
        this.img = img;
        this.title = title;
    }



    // ▬ ▬
   public row(){

   }



   // ▬ "GETTER" → FOR "IMAGE" ▬
    public int getImg() {
        return img;
    }



   // ▬ "GETTER" → FOR "TITLE" ▬
    public String getTitle() {
        return title;
    }

}
