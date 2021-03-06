package worker8.com.github.jimgur.imgur.gallery_api;

import java.io.Serializable;

public class GalleryResponse implements Serializable
{
    private String status;

    private Data data;

    private String success;

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }

    public String getSuccess ()
    {
        return success;
    }

    public void setSuccess (String success)
    {
        this.success = success;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [status = "+status+", data = "+data+", success = "+success+"]";
    }
}