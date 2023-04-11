import com.google.gson.Gson;

public class JsonParseApp {
//    public static void main(String[] args) {
    public static String msgParse(ResponseMsg msg){
        //MIME 타입중에 하나를 보내야 한다.
        //: MIME 타입중 application/json 이용

        Gson gson = new Gson();
        //Gson을 이용해 직렬화해 BW
        String json = gson.toJson(msg);
        //역직렬화해 BR

        System.out.println(json);
        return json;
    }
}
