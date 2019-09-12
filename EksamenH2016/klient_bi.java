class klient_bi {
	int valg = showOptionDialog(null, "Velg operasjon", "Eksamen høst 2016", YES_NO_OPTION, INFORMATION_MESSAGE, null, muligheter, muligheter[0]);
	String filnavn = showInputDialog("filnavn: ");
	  Utleiefirma utleieFirma = lesUtleieFirmaFraFil(filnavn);

	while (valg != AVSLUTT){
	switch (valg){
	case NYTT_FIRMA:
		// skal ikke fylles ut
		break;
	case REG_BIL:
	if (utleieFirma != null){

		  /* OPPGAVE j) fylles inn her */	}
		break;
	case LIST_FIRMA:
	if (utleieFirma != null){// skal ikke fylles ut }
	break;
	case LIST_SORTERT:
	if (utleieFirma != null){ // skal ikke fylles ut }
		break;
	case HENT_SAMME_GIRKASSE:
	if (utleieFirma != null){// skal ikke fylles ut}
	default: break;
	}
	valg = showOptionDialog(null,"Velg operasjon","Eksamen høst 2016", DEFAULT_OPTION, PLAIN_MESSAGE, null, muligheter, muligheter[0]);
	}
}
