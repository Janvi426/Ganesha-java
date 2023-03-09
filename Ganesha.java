// creat lord Ganesha's pattern

public class Ganesha
{    
    // FUNCTION - Decoration
    public static void decoration(int i){
        if(i == 0){
            System.out.println();
        } else {
            for(int p=1; p<=6; p++){
                System.out.print("✪           ✪ ❂ ");
            }
            System.out.println();
            for(int p=1; p<=6; p++){
                System.out.print(" ✪         ✪ |||");
            }
            System.out.println();
            for(int p=1; p<=6; p++){
                System.out.print("  ✪       ✪  |||");
            }
            System.out.println();
            for(int p=1; p<=6; p++){
                System.out.print("   ✪     ✪   |||");
            }
            System.out.println();
            for(int p=1; p<=6; p++){
                System.out.print("    ✪ ✪ ✪    |||");
            }
            System.out.println();
            for(int p=1; p<=6; p++){
                System.out.print("             ❁|❁");
            }
            System.out.println();
            for(int p=1; p<=6; p++){
                System.out.print("              ♥ ");
            }
        }
    }

    public static void main(String[] args){
     
        // decoration 
        for(int i=1; i<=5; i++){
            System.out.println();
        }       
        for(int l=1; l<=8; l++){
            for(int d=1; d<=4; d++){
                if(l == 1){
                   System.out.print("♡ ☆ .♡‧₊˚                 ");
                } else if(l == 2){
                    System.out.print("╭◜◝ ͡ ◜◝╮  ㅤ ╭◜◝ ͡ ◜◝╮. ");
                } else if(l == 3){
                    System.out.print("(       ) ♡ (        ) ");
                } else if(l == 4){
                    System.out.print("╰◟◞ ͜ ◟◞╭◜◝ ͡ ◜◝╮ ͜ ◟◞╯ ♡ ");
                }  else if(l == 5){
                    System.out.print(". ☆   ㅤ(      )    ☆ ♡");
                }  else if(l == 6){
                    System.out.print("♡ 　    ╰◟◞ ͜ ◟◞╯    . ☆");
                }  else if(l == 7){
                    System.out.print("   ");
                }  else if(l == 8){
                    System.out.print("      ପ(๑•ᴗ•๑)ଓ ♡     ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------------Ⓐ Ⓛ Ⓐ ​ ​ Ⓡ Ⓔ  ​ Ⓐ Ⓛ Ⓐ  ​ Ⓖ Ⓐ Ⓝ Ⓐ Ⓟ Ⓐ Ⓣ Ⓘ  ​ Ⓐ Ⓛ Ⓐ-------------------------");
        System.out.println();

            // function call - decoration
            decoration(1);
            for(int i=1; i<=6; i++){
                System.out.println();
            } 
        // Ganesha pattern 1
        // crown of lord Ganesha

        System.out.println("▲");
        System.out.println("◠◠");
        for(int i =1; i<=4; i++){
            for(int j=1; j<=i+3; j++){
                System.out.print("◠");
            }
            System.out.println();
        }
        System.out.println("(~)(~)(~)");

        // face and trunk  
        for(int i=0; i<=3; i++){
            for(int j=0; j<=i+8; j++){
                System.out.print(" ");
            }
            System.out.println("oo");
        }
        System.out.println("  〈<⓪>〉   oo");
        for(int i=0; i<=1; i++){
            for(int j=0; j<=11; j++){
                System.out.print(" ");
            }
            System.out.println("oo");
        }
        for(int i=0; i<=9; i++){
            for(int j=13-i; j>=3; j--){
                System.out.print(" ");
            }
            System.out.println("oo");
        }
        System.out.println(" o     o");
        System.out.println(" o      o");
        System.out.println("  o     o");
        System.out.println("   o o o"); 
        System.out.println();
        System.out.println();
        
        // decor 2
        System.out.println("                           𝐓 𝐄 𝐂 𝐇 𝐃 𝐀 𝐍 𝐓 𝐀 𝐘   -   ⓶ ⓪ ⓶ ⓶ ");
        for(int i=1; i<=8; i++){
            System.out.print("◠◠◠◠◠◠◠◠◠◠◠◠");
        }
        System.out.println();
        System.out.println("                       𝔾 𝔸 ℕ ℙ 𝔸 𝕋 𝕀    𝔹 𝔸 ℙ ℙ 𝔸    𝕄 𝕆 ℝ 𝕀 𝕐 𝔸          ");
        for(int i=1; i<=8; i++){
            System.out.print("◡◡◡◡◡◡◡◡◡◡◡◡");
        }
        System.out.println();
        
        // function call - decoration
        decoration(1);
        
        System.out.println();

        // Ganesha pattern 2
        // crown
        
        for(int l=1; l<=7; l++){
            for(int sp=1; sp<=45-l; sp++){
                System.out.print(" ");
            }
            for(int c=1; c<=l; c++){
                System.out.print( "⭒꙰ ");
            }
            System.out.println();
        }

        // ear and face  
        for(int l=1; l<=4; l++){
            for(int sp=1; sp<=l+32; sp++){
                System.out.print(" ");
            }
            for(int e=1; e<=5-l; e++){
                System.out.print("⊰");
            }
            for(int f=1; f<=7; f++){
                System.out.print("☾☽");
            }
            for(int e=1; e<=5-l; e++){
                System.out.print("⊱");
            }
            System.out.println();
        }
        for(int l=0; l<=2; l++){
            for(int sp=1; sp<=l+37; sp++){
                System.out.print(" ");
            }
            for(int f=1; f<=7-l; f++){
                System.out.print("☾☽"); 
            }
            System.out.println();
        }

        for(int l=0; l<=4; l++){
            for(int sp=1; sp<=41; sp++){
                System.out.print(" ");
            }
            for(int f=1; f<=3; f++){
                System.out.print("☾☽"); 
            }
            System.out.println();
        }
        for(int l=1; l<=2; l++){
            for(int sp=1; sp<=42-l; sp++){
                System.out.print(" ");
            }
            for(int j=1; j<=1; j++){
                System.out.print("☾☾☽☾☽☽");
            }
            System.out.println();
        }
        for(int l=1; l<=2; l++){
            for(int sp=1; sp<=40-l; sp++){
                System.out.print(" ");
            }
            for(int j=1; j<=1; j++){
                System.out.print("☾☾0☽☽");
            }
            System.out.println();
        }
        System.out.println("                                      ☾o☽");
        System.out.println("                                       ☾o☽");
        System.out.println("                                         o");
        for(int i=1; i<=4; i++){
            System.out.println();
        } 
    } 
}  