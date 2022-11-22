import java.util.Optional;

public class Button {

    private String title;
    private OnClickListener OnClickListener;

    public Button(String title) {
        this.title = title;
    }
    public String getTitle(){
        return  title;
    }
    public void setOnClickListener (OnClickListener OnClickListener){
        this.OnClickListener = OnClickListener;
    }
    public void onClick(){
        this.OnClickListener.onClick(this.title);
    }
    public interface OnClickListener{
        public void onClick(String title);
    }
}
