package com.example.buttonsheetproject_new

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.buttonsheetproject_new.databinding.FragmentButtonsheetfragmentBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class buttonsheetfragment : BottomSheetDialogFragment() {
  lateinit var binding: FragmentButtonsheetfragmentBinding;
    private lateinit var recyclerView: RecyclerView;
    val parentModelArrayList = ArrayList<ParentModel>();
    private var ParentAdapter: RecyclerView.Adapter<*>? = null
    private val context: Context? = null

    private var parentLayoutManager: RecyclerView.LayoutManager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {

            binding=FragmentButtonsheetfragmentBinding.inflate(inflater,container,false)
             parentModelArrayList.add(ParentModel("Category1"))
             parentModelArrayList.add(ParentModel("Category2"))
             parentModelArrayList.add(ParentModel("Category3"))
             parentModelArrayList.add(ParentModel("Category4"))
             parentModelArrayList.add(ParentModel("Category5"))
             var parentrecycleview= binding.ParentRecyclerView
             parentrecycleview.setHasFixedSize(true)
             parentLayoutManager = LinearLayoutManager(context)
             ParentAdapter = ParentRecyclerViewAdapter(parentModelArrayList, this)
             parentrecycleview.layoutManager=parentLayoutManager;
             parentrecycleview.adapter=ParentAdapter;
             (ParentAdapter as ParentRecyclerViewAdapter).notifyDataSetChanged()


        return  binding.root;
    }

    companion object {
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            buttonsheetfragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

private infix fun Int.setHasFixedSize(b: Boolean) {

}
