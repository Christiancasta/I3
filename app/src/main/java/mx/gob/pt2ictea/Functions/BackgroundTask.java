package mx.gob.pt2ictea.Functions;

import android.content.Context;
import android.os.AsyncTask;
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

public class BackgroundTask extends AsyncTask<String, Void, String > {

    Context ctx;
    public BackgroundTask(Context ctx){
        this.ctx = ctx;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... params) {
        String reg_url = "https://ictea.000webhostapp.com/formulario.php";
        String method = params[0];
        if(method.equals("formulario"))
        {
            String nombre = params[1];
            String telefono = params[2];
            String curso = params[3];
            String plantel = params[4];
            String comentarios = params[5];

            try {
                URL url = new URL(reg_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream OS = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(OS, "UTF-8"));

                String data = URLEncoder.encode("nombre", "UTF-8") + "="+URLEncoder.encode(nombre, "UTF-8")+"&"+
                        URLEncoder.encode("telefono", "UTF-8") + "="+URLEncoder.encode(telefono, "UTF-8")+"&"+
                        URLEncoder.encode("curso", "UTF-8") + "="+URLEncoder.encode(curso, "UTF-8")+"&"+
                        URLEncoder.encode("plantel", "UTF-8") + "="+URLEncoder.encode(plantel, "UTF-8")+"&"+
                        URLEncoder.encode("comentarios", "UTF-8") + "="+URLEncoder.encode(comentarios, "UTF-8");

                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                OS.close();
                InputStream IS = httpURLConnection.getInputStream();
                IS.close();
                return "Información enviada con exito";

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(ctx, "Información enviada con exito", Toast.LENGTH_SHORT).show();
    }
}