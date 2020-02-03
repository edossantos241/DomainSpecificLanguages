class myFsm extends FSM{
			public static void main(String args[]){
							State initial = new sI();
							State finalState = new sF();
							State current =  initial;
							System.out.println("D�but");
							while (current != finalState){
								switch (current.getClass().getName()) {
									case "sI":
										System.out.println("Transition de l'�tat initial � l'�tat ouvert");
										current = new sOpen();
										break;
									case "sOpen":
										System.out.println("Transition de l'�tat ouvert � l'�tat ferm�");
										current = new sFerme();
										break;
									case "sFerme":
										System.out.println("Transition de l'�tat ferm� � l'�tat final");
										current = finalState;
										break;
								}
							}
							System.out.println("Etat final atteind");
						}