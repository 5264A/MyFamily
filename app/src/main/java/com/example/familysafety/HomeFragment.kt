package com.example.familysafety

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var listMembers= listOf<MemberModel>(
                    MemberModel("Aman"),
                    MemberModel("Rophan"),
                    MemberModel("Amanhi")

        )



    }

    override fun onCreateView(
      inflater: LayoutInflater,container:ViewGroup?,
      savedInstanceState: Bundle?
    ):View?{
        return inflater.inflate(R.layout.fragment_home,container,false)

    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}