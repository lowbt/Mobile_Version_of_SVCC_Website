//package com.systemvertex.mobileversionofsvccwebsite
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.systemvertex.mobileversionofsvccwebsite.R
//import com.systemvertex.mobileversionofsvccwebsite.fragments.StoreFragment
//import com.systemvertex.mobileversionofsvccwebsite.model.Store
//
//class StoreItemAdapter(
//    private val context: StoreFragment,
//    private val dataset: List<Store>
//): RecyclerView.Adapter<StoreItemAdapter.StoreItemViewHolder>() {
//
////    private var _binding: FragmentStoreBinding? = null
////
////    private val binding get() = _binding
//
//    // Try to use view binding to access the recyclerview in fragment_store layout
////    lateinit var view = getView().findViewById<RecyclerView>(R.id.store_recycler_view)
//
//    class StoreItemViewHolder(private val view: ): RecyclerView.ViewHolder(View) {
//        val textView: TextView = view.findViewById(R.id.store_item_desc)
//        val imageView: ImageView = view.findViewById(R.id.store_item_image)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreItemViewHolder {
//        val adapterLayout = LayoutInflater.from(parent.context)
//            .inflate(R.layout.store_item_list, parent, false)
//
//        return StoreItemViewHolder(adapterLayout)
//    }
//
//    override fun onBindViewHolder(holder: StoreItemViewHolder, position: Int) {
//        val item = dataset[position]
//
//        holder.textView.text = context.resources.getString(item.stringResId)
//        holder.imageView.setImageResource(item.imageResId)
//    }
//
//    override fun getItemCount(): Int = dataset.size
//
//}