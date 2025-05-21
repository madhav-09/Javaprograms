package Day1;
// * * * * * 
// * * * * *
// * * * * *
// * * * * *
// * * * * *

// public class BoxPattern {

// 	public static void main(String[] args) {
// 		for(int i =1;i<=5;i++) {
// 			for(int j=1;j<=5;j++) {
// 				System.out.print("* ");
// 			}
// 			System.out.println( );
// 		}
// 	}

// }


// * * * * * 
// *       *
// *       *
// *       *
// * * * * *

// public class BoxPattern {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 5; i++) {
//             for(int j = 1; j <= 5; j++) {
//                 if(i == 1 || i == 5 || j == 1 || j == 5)
//                     System.out.print("* ");
//                 else
//                     System.out.print("  ");
//             }
//             System.out.println(); 
//         }
//     }
// }



// *  *  *  *  *  *  *  *  *  *  * 
// *              *              *
// *              *              *
// *              *              *
// *              *              *
// *  *  *  *  *  *  *  *  *  *  *
// *              *              *
// *              *              *
// *              *              *
// *              *              *
// *  *  *  *  *  *  *  *  *  *  *

public class BoxPattern {
    public static void main(String[] args) {
		int n = 11;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j == 1 || j == n ||i==1|| i == n || i == (n+1)/2 || j==(n+1)/2 )
                    System.out.print(" * ");
                else{
                    System.out.print("   ");
            }
		}
            System.out.println(); 
        }
    }

}






// *  *  *  *  *  *  *  *  *  *  * 
// *  *                       *  *
// *     *                 *     *
// *        *           *        *
// *           *     *           *
// *              *              *
// *           *     *           *
// *        *           *        *
// *     *                 *     *
// *  *                       *  *
// *  *  *  *  *  *  *  *  *  *  *

// public class BoxPattern {
//     public static void main(String[] args) {
// 		int n = 11;
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n; j++) {
//                 if(j == 1 || j == n ||i==1|| i == n ||  i==j || i+j==n+1 )
//                     System.out.print(" * ");
//                 else{
//                     System.out.print("   ");
//             }
// 		}
//             System.out.println(); 
//         }
//     }

// }







// *  *  *  *  *  *  *  *  *  *  * 
// *  *           *           *  *
// *     *        *        *     *
// *        *     *     *        *
// *           *  *  *           *
// *  *  *  *  *  *  *  *  *  *  *
// *           *  *  *           *
// *        *     *     *        *
// *     *        *        *     *
// *  *           *           *  *
// *  *  *  *  *  *  *  *  *  *  *

// public class BoxPattern {
//     public static void main(String[] args) {
// 		int n = 11;
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n; j++) {
//                 if(j == 1 || j == n ||i==1|| i == n || i == (n+1)/2 || j==(n+1)/2 || i==j || i+j==n+1 )
//                     System.out.print(" * ");
//                 else{
//                     System.out.print("   ");
//             }
// 		}
//             System.out.println(); 
//         }
//     }

// }