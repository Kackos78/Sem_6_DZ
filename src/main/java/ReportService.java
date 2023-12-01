import java.util.HashMap;

public class ReportService {

    private HashMap<String, String> instructions;
    private void fillInstructions() {
        instructions.put("pdf-1", pdf1());
        instructions.put("json", json());
        instructions.put("xml", xml());
    }

    public byte[] createReport(Document document, String reportType) {
        String text = document.getText();
        fillInstructions();
        for (String key: instructions.keySet()) {
            if(key.equals(reportType)){
                System.out.println(instructions.get(key));
                break;
            }

        }
        System.out.println("Отчет в формате" + reportType);
        return null;
    }

    private String pdf1 (){
        return "some instructions for pdf-1";
    }

    private String json (){
        return "some instructions for json";
    }
    private String xml (){
        return "some instructions for xml";
    }
}
