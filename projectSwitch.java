public class projectSwitch {
    void Project_Switch(int choose){
        int exit = 1;
        while(exit!=0){

        switch(choose){
            case 1:
            System.out.print("Yess");
            break;
            default :
            Error er = new Error();
            er.error();
            System.out.println("\n\t\tError....\n\t\tPlease Enter Valid Key.\n");
            break;
        }
        exit=choose;
    };


    }
}
