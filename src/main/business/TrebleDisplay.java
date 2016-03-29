package main.business;

public class TrebleDisplay {
	String noteOne="";
	String noteTwo="";
	String noteThree="";

	public void TrebleNoteDisplay(String noteOne,String noteTwo,String noteThree){
		this.noteOne=noteOne;
		this.noteTwo=noteTwo;
		this.noteThree=noteThree;
		String dash="-----";
		String blank="     ";
		String whole="--O--";
		String noBars="  O  ";

		String[][] clefNew= new String[11][9];

		for (int i=0;i<clefNew.length-1;i++){
			for(int j=0;j<clefNew[0].length;j++){
				if (i%2 ==0){
					clefNew[i][j]=dash;
				}else{
					clefNew[i][j]=blank;			
				}
			}
		}
		for(int i=0;i<clefNew[0].length;i++){
			clefNew[10][i]=blank;
		}

		switch(noteOne){
		case "b":
			clefNew[4][0]=whole;
			break;
		case "a":
			clefNew[5][0]=noBars;
			break;
		case "g":
			clefNew[6][0]=whole;
			break;
		case "f":
			clefNew[7][0]=noBars;
			break;
		case "e":
			clefNew[8][0]=whole;
			break;
		case "d":
			clefNew[9][0]=noBars;
			break;
		case "c":
			clefNew[10][0]=whole;
			break;
		case "":
			break;
		default:
			break;
		}

		switch(noteTwo){
		case "b":
			clefNew[4][1]=whole;
			break;
		case "a":
			clefNew[5][1]=noBars;
			break;
		case "g":
			clefNew[6][1]=whole;
			break;
		case "f":
			clefNew[7][1]=noBars;
			break;
		case "e":
			clefNew[8][1]=whole;
			break;
		case "d":
			clefNew[9][1]=noBars;
			break;
		case "c":
			clefNew[10][1]=whole;
			break;
		case "":
			break;
		default:
			break;
		}

		switch(noteThree){
		case "b":
			clefNew[4][2]=whole;
			break;
		case "a":
			clefNew[5][2]=noBars;
			break;
		case "g":
			clefNew[6][2]=whole;
			break;
		case "f":
			clefNew[7][2]=noBars;
			break;
		case "e":
			clefNew[8][2]=whole;
			break;
		case "d":
			clefNew[9][2]=noBars;
			break;
		case "c":
			clefNew[10][2]=whole;
			break;
		case "":
			break;
		default:
			break;
		}
		
		System.out.println("Treble");
		for (int i=0;i<clefNew.length;i++){
			for(int j=0;j<clefNew[0].length;j++){
				System.out.print(clefNew[i][j]);
			}System.out.println();
		}
	}
	public void TrebleNoteDisplay(String noteOne,String noteTwo){
		this.noteOne=noteOne;
		this.noteTwo=noteTwo;
		String dash="-----";
		String blank="     ";
		String whole="--O--";
		String noBars="  O  ";

		String[][] clefNew= new String[11][11];

		for (int i=0;i<clefNew.length-1;i++){
			for(int j=0;j<clefNew[0].length;j++){
				if (i%2 ==0){
					clefNew[i][j]=dash;
				}else{
					clefNew[i][j]=blank;			
				}
			}
		}
		for(int i=0;i<clefNew[0].length;i++){
			clefNew[10][i]=blank;
		}

		switch(noteOne){
		case "b":
			clefNew[4][0]=whole;
			break;
		case "a":
			clefNew[5][0]=noBars;
			break;
		case "g":
			clefNew[6][0]=whole;
			break;
		case "f":
			clefNew[7][0]=noBars;
			break;
		case "e":
			clefNew[8][0]=whole;
			break;
		case "d":
			clefNew[9][0]=noBars;
			break;
		case "c":
			clefNew[10][0]=whole;
			break;
		case "":
			break;
		default:
			break;
		}

		switch(noteTwo){
		case "b":
			clefNew[4][1]=whole;
			break;
		case "a":
			clefNew[5][1]=noBars;
			break;
		case "g":
			clefNew[6][1]=whole;
			break;
		case "f":
			clefNew[7][1]=noBars;
			break;
		case "e":
			clefNew[8][1]=whole;
			break;
		case "d":
			clefNew[9][1]=noBars;
			break;
		case "c":
			clefNew[10][1]=whole;
			break;
		case "":
			break;
		default:
			break;
		}
		System.out.println("Treble");
		for (int i=0;i<clefNew.length;i++){
			for(int j=0;j<clefNew[0].length;j++){
				System.out.print(clefNew[i][j]);
			}System.out.println();
		}
	}
	public void TrebleNoteDisplay(String noteOne){
		this.noteOne=noteOne;
		String dash="-----";
		String blank="     ";
		String whole="--O--";
		String noBars="  O  ";

		String[][] clefNew= new String[11][11];

		for (int i=0;i<clefNew.length-1;i++){
			for(int j=0;j<clefNew[0].length;j++){
				if (i%2 ==0){
					clefNew[i][j]=dash;
				}else{
					clefNew[i][j]=blank;			
				}
			}
		}
		for(int i=0;i<clefNew[0].length;i++){
			clefNew[10][i]=blank;
		}

		switch(noteOne){
		case "b":
			clefNew[4][0]=whole;
			break;
		case "a":
			clefNew[5][0]=noBars;
			break;
		case "g":
			clefNew[6][0]=whole;
			break;
		case "f":
			clefNew[7][0]=noBars;
			break;
		case "e":
			clefNew[8][0]=whole;
			break;
		case "d":
			clefNew[9][0]=noBars;
			break;
		case "c":
			clefNew[10][0]=whole;
			break;
		case "":
			break;
		default:
			break;
		}
		System.out.println("Treble");
		for (int i=0;i<clefNew.length;i++){
			for(int j=0;j<clefNew[0].length;j++){
				System.out.print(clefNew[i][j]);
			}System.out.println();
		}
	}
}
