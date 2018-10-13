package agustinreinoso.altice.com.recyclerviews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import agustinreinoso.altice.com.recyclerviews.models.Carro;

public class CarroAdapter extends RecyclerView.Adapter<CarroAdapter.CarroViewHolder> {

    private Context context;
    private List<Carro> carros;

    public CarroAdapter(Context appContext, List<Carro> listCarro) {
        context = appContext;
        carros = listCarro;

    }

    @Override
    public CarroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(viewType, parent, false);
        CarroViewHolder viewHolder = new CarroViewHolder(view);
        return viewHolder;
    }

    @Override
    public int getItemViewType(int position) {
       if (position == 0) {
           return R.layout.big_card_layout;
        } else if (position % 2 == 0) {
            return R.layout.medium_card_layout;
        } else {
            return R.layout.small_card_layout;
      }
    }

    @Override
    public void onBindViewHolder(CarroViewHolder holder, int position) {
        Carro carro = carros.get(position);
        holder.setText(carro,context);

    }

    @Override
    public int getItemCount() {
        return carros.size();
    }

    public static class CarroViewHolder extends RecyclerView.ViewHolder {
        TextView marcaLbl;
        TextView paislLbl;
        ImageView imageView;

        public CarroViewHolder(View itemView) {
            super(itemView);
            marcaLbl = itemView.findViewById(R.id.lbl_marca);
            paislLbl = itemView.findViewById(R.id.lbl_pais);
            imageView=itemView.findViewById(R.id.car_image);
        }

        public void setText(Carro carro,Context context) {
            marcaLbl.setText(carro.getMarca());
            paislLbl.setText(carro.getPais());
            Glide.with(context).load("http://goo.gl/gEgYUd").into(imageView);
            ///GlideApp.with(this).load(carro.getUrl()).into(imageView);

        }
    }
}
