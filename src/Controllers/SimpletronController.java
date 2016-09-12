package Controllers;

/**
 *
 * @author Gilberto León
 */
public class SimpletronController {
    
    public String parseLMS(int[] LMSCodes, int codesLength) {
        String assemblyCode = "";
        
        for (int i = 0; i < codesLength; i++) {
            assemblyCode += i + ": " + getInstruction(LMSCodes[i]);
        }
        
        return assemblyCode;
    }
    
    private String getInstruction(int instruction) {
        String instructionString = "";
        
        int code = instruction / 100;
        
        switch(code) {
            case 0:
                instructionString = "VARIABLE";
                break;
            case 10:
                instructionString = "LEE";
                break;
            case 11:
                instructionString = "ESCRIBE";
                break;
            case 20:
                instructionString = "CARGA";
                break;
            case 21:
                instructionString = "ALMACENA";
                break;
            case 30:
                instructionString = "SUMA";
                break;
            case 31:
                instructionString = "RESTA";
                break;
            case 32:
                instructionString = "DIVIDE";
                break;
            case 33:
                instructionString = "MULTIPLICA";
                break;
            case 40:
                instructionString = "BIFURCA";
                break;
            case 41:
                instructionString = "BIFURCANEG";
                break;
            case 42:
                instructionString = "BIFURCACERO";
                break;
            case 43:
                instructionString = "ALTO";
                break;
        }
        
        if (code != 0) {
            int operator = instruction % 100;
            instructionString += " " + operator;
        }
        
        return instructionString + "\n";
    }
}
