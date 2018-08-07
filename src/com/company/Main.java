package com.company;

public class Main {

    public static void main(String[] args) {
            //Intellij github project
            //VCS --> enable version control integration
            //.ignore intellij addon letoltese majd settings-->plugins-->install plugin from disk -->es a jar filet hozzadni
            //majd projektra jobb klikk -->new -->.ignore-->es ott gitgonore-->rakkattintasz a javara-es berakja a gitignoret majd hozza kell irni hogy .idea es *.iml
            //majd kent be lehet kapcsolni a version control panelt-->ott latszodik mi piros
            //ott jobb klikk add majd -->commit changes vagy commit 1 file
            //majd letre kell hozni egy repositoryt githubon
            //utanna VCS-->push es ott setup remote-->ott berakni a github linket https://github.com/vellindra/GithubDemo.git amit letrehoztal
            //es igy feltolti
        System.out.println("Hello world");
        for(int i=0;i<100;i++){
            System.out.println("Test" + i);
        }
    }
}
