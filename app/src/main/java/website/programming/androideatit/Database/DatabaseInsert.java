package website.programming.androideatit.Database;

        import android.content.Context;
        import android.os.AsyncTask;
        import android.util.Log;
        import android.widget.Toast;

        import java.io.BufferedWriter;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.OutputStream;
        import java.io.OutputStreamWriter;
        import java.net.HttpURLConnection;
        import java.net.MalformedURLException;
        import java.net.URL;
        import java.net.URLEncoder;

        import website.programming.androideatit.Common.Common;

/**
 * Created by ashu on 16-Apr-16.
 */
public class DatabaseInsert extends AsyncTask<String,Void,String> {

    Context ctx;
    public DatabaseInsert(Context ctx){
        this.ctx=ctx;
    }


    protected String doInBackground(String... params) {

        String reg_url=Common.SERVER_URL + "add.php";
        String method= params[0];
        Log.i("URL", reg_url);

        if(method.equals("signup")){
            String phone= params[1];
            String name=params[2];
            String password=params[3];
            String staff="false";
            String securecode=params[4];

            try {
                URL url= new URL(reg_url);
                HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream os= httpURLConnection.getOutputStream();

                BufferedWriter bufferedWriter= new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));

                String data= URLEncoder.encode("method", "UTF-8")+"="+URLEncoder.encode(method,"UTF-8")+"&"+
                        URLEncoder.encode("phone", "UTF-8")+"="+URLEncoder.encode(phone,"UTF-8")+"&"+
                        URLEncoder.encode("name","UTF-8")+"="+URLEncoder.encode(name,"UTF-8")+"&"+
                        URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8")+"&"+
                        URLEncoder.encode("staff","UTF-8")+"="+URLEncoder.encode(staff,"UTF-8")+"&"+
                        URLEncoder.encode("securecode","UTF-8")+"="+URLEncoder.encode(securecode,"UTF-8");

             //   Log.i("url:", data);

                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                os.close();
                InputStream IS= httpURLConnection.getInputStream();
                IS.close();
                return "Sign Up Successfully.";

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        else if(method.equals("updatepwd")){

            String phone= params[1];
            String password=params[2];

          //  Log.i("Phone: " , phone);
         //   Log.i("password: " , password);

            try {
                URL url= new URL(reg_url);
                HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream os= httpURLConnection.getOutputStream();

                BufferedWriter bufferedWriter= new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));

                String data= URLEncoder.encode("method", "UTF-8")+"="+URLEncoder.encode(method,"UTF-8")+"&"+
                        URLEncoder.encode("phone", "UTF-8")+"="+URLEncoder.encode(phone,"UTF-8")+"&"+
                        URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8");

            //    Log.i("url:", data);

                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                os.close();
                InputStream IS= httpURLConnection.getInputStream();
                IS.close();
                return "Change Password Successfully.";

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        else if(method.equals("Rating")){

            String phone= params[1];
            String foodId=params[2];
            String value=params[3];
            String comments=params[4];


            try {
                URL url= new URL(reg_url);
                HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream os= httpURLConnection.getOutputStream();

                BufferedWriter bufferedWriter= new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));

                String data= URLEncoder.encode("method", "UTF-8")+"="+URLEncoder.encode(method,"UTF-8")+"&"+
                        URLEncoder.encode("phone", "UTF-8")+"="+URLEncoder.encode(phone,"UTF-8")+"&"+
                        URLEncoder.encode("foodId", "UTF-8")+"="+URLEncoder.encode(foodId,"UTF-8")+"&"+
                        URLEncoder.encode("value", "UTF-8")+"="+URLEncoder.encode(value,"UTF-8")+"&"+
                        URLEncoder.encode("comments","UTF-8")+"="+URLEncoder.encode(comments,"UTF-8");

           //     Log.i("url:", data);

                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                os.close();
                InputStream IS= httpURLConnection.getInputStream();
                IS.close();
                return "Add Rating Successfully";

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        else if(method.equals("Order")){

            String orderid= params[1];
            String phone= params[2];
            String name=params[3];
            String address=params[4];
            String total=params[5];
            String status=params[6];
            String comment=params[7];
            String paymentState=params[8];
            String foods=params[9];

            try {
                URL url= new URL(reg_url);
                HttpURLConnection httpURLConnection= (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream os= httpURLConnection.getOutputStream();

                BufferedWriter bufferedWriter= new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));

                String data= URLEncoder.encode("method", "UTF-8")+"="+URLEncoder.encode(method,"UTF-8")+"&"+
                        URLEncoder.encode("orderid", "UTF-8")+"="+URLEncoder.encode(orderid,"UTF-8")+"&"+
                        URLEncoder.encode("phone", "UTF-8")+"="+URLEncoder.encode(phone,"UTF-8")+"&"+
                        URLEncoder.encode("name", "UTF-8")+"="+URLEncoder.encode(name,"UTF-8")+"&"+
                        URLEncoder.encode("address", "UTF-8")+"="+URLEncoder.encode(address,"UTF-8")+"&"+
                        URLEncoder.encode("total", "UTF-8")+"="+URLEncoder.encode(total,"UTF-8")+"&"+
                        URLEncoder.encode("status", "UTF-8")+"="+URLEncoder.encode(status,"UTF-8")+"&"+
                        URLEncoder.encode("comment", "UTF-8")+"="+URLEncoder.encode(comment,"UTF-8")+"&"+
                        URLEncoder.encode("paymentState", "UTF-8")+"="+URLEncoder.encode(paymentState,"UTF-8")+"&"+
                        URLEncoder.encode("foods","UTF-8")+"="+URLEncoder.encode(foods,"UTF-8");

                Log.i("url:", data);

                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                os.close();
                InputStream IS= httpURLConnection.getInputStream();
                IS.close();
                return "Order Successfully";

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        //Toast.makeText(ctx, result, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
