package com.caparepa.companionfou.ui.fragment.ftux

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.caparepa.companionfou.R
import com.caparepa.companionfou.ui.dialog.LoadingDialog
import com.caparepa.companionfou.ui.viewmodel.download.DownloadViewModel
import com.caparepa.companionfou.ui.viewmodel.general.GeneralDataViewModel
import com.caparepa.companionfou.ui.viewmodel.nice.*
import com.caparepa.companionfou.utils.*
import kotlinx.android.synthetic.main.fragment_loading.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import org.koin.core.KoinComponent

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoadingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoadingFragment : Fragment(), KoinComponent {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private val downloadViewModel: DownloadViewModel by sharedViewModel()
    private val generalViewModel: GeneralDataViewModel by sharedViewModel()
    private val commandCodeViewModel: CommandCodeViewModel by sharedViewModel()
    private val craftEssenceViewModel: CraftEssenceViewModel by sharedViewModel()
    private val materialViewModel: MaterialViewModel by sharedViewModel()
    private val mysticCodeViewModel: MysticCodeViewModel by sharedViewModel()
    private val servantViewModel: ServantViewModel by sharedViewModel()

    private lateinit var loadingDialog: LoadingDialog
    private var downloadOkPool: ArrayList<String> =
        arrayListOf() //there should be 20 elements here at the end
    private var downloadErrorPool: ArrayList<String> =
        arrayListOf() //there should be 10 elements here at the end


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_loading, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadingDialog = LoadingDialog(requireContext())
        generalViewModel.getLatestApiInfo()
        observeDownloadViewModel()
        observeViewModels()
    }

    private fun observeDownloadViewModel() {
        downloadViewModel.run {

        }
    }

    private fun downloadGeneralData(server: String) {
        generalViewModel.getApiInfo()
        generalViewModel.getAttributeRelation(server)
        generalViewModel.getBuffActionList(server)
        generalViewModel.getClassAttackRate(server)
        generalViewModel.getClassRelation(server)
        generalViewModel.getConstants(server)
        generalViewModel.getFaceCard(server)
        generalViewModel.getGameEnums(server)
        generalViewModel.getTraitMapping(server)
        generalViewModel.getUserLevel(server)
    }

    private fun downloadGameData(server: String) {
        commandCodeViewModel.getCommandCodes(server)
        craftEssenceViewModel.getCraftEssences(server)
        materialViewModel.getMaterials(server)
        mysticCodeViewModel.getMysticCodes(server)
        servantViewModel.getServants(server)
    }

    private fun observeViewModels() {
        generalViewModel.run {
            loadingState.observe(viewLifecycleOwner, Observer {
                if (it) {
                    loadingDialog.setCanceledOnTouchOutside(false)
                    loadingDialog.show()
                } else {
                    loadingDialog.dismiss()
                }
            })
            currentDateResult.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    downloadGeneralData(REGION_NA)
                    downloadGameData(REGION_NA)
                    downloadGeneralData(REGION_JP)
                    downloadGameData(REGION_JP)
                }
            })
            onError.observe(viewLifecycleOwner, Observer {
                it?.let {
                    requireActivity().toastLong(it)
                }
            })
            apiInfoResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_apiInfoResponseOk.text = "apiInfoResponseOk $it"
                } else {
                    tv_apiInfoResponseOk.text = "apiInfoResponseOk $it NOK"
                }
            })
            attributeRelationResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_attributeRelationResponseOk.text = "attributeRelationResponseOk $it"
                } else {
                    tv_attributeRelationResponseOk.text = "attributeRelationResponseOk $it NOK"
                }
            })
            classAttackRateResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_classAttackRateResponseOk.text = "classAttackRateResponseOk $it"
                } else {
                    tv_classAttackRateResponseOk.text = "classAttackRateResponseOk $it NOK"
                }
            })
            classRelationResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_classRelationResponseOk.text = "classRelationResponseOk $it"
                } else {
                    tv_classRelationResponseOk.text = "classRelationResponseOk $it NOK"
                }
            })
            faceCardResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_faceCardResponseOk.text = "faceCardResponseOk $it"
                } else {
                    tv_faceCardResponseOk.text = "faceCardResponseOk $it NOK"
                }
            })
            constantsResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_constantsResponseOk.text = "constantsResponseOk $it"
                } else {
                    tv_constantsResponseOk.text = "constantsResponseOk $it NOK"
                }
            })
            buffActionListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_buffActionListResponseOk.text = "buffActionListResponseOk $it"
                } else {
                    tv_buffActionListResponseOk.text = "buffActionListResponseOk $it NOK"
                }
            })
            userLevelResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_userLevelResponseOk.text = "userLevelResponseOk $it"
                } else {
                    tv_userLevelResponseOk.text = "userLevelResponseOk $it NOK"
                }
            })
            allEnumsResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_allEnumsResponseOk.text = "allEnumsResponseOk $it"
                } else {
                    tv_allEnumsResponseOk.text = "allEnumsResponseOk $it NOK"
                }
            })
            traitMappingResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_traitMappingResponseOk.text = "traitMappingResponseOk $it"
                } else {
                    tv_traitMappingResponseOk.text = "traitMappingResponseOk $it NOK"
                }
            })
        }
        commandCodeViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            commandCodeListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_commandCodeListResponseOk.text = "commandCodeListResponseOk $it"
                } else {
                    tv_commandCodeListResponseOk.text = "commandCodeListResponseOk $it NOK"
                }
            })
        }
        craftEssenceViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            craftEssenceListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_craftEssenceListResponseOk.text = "craftEssenceListResponseOk $it"
                } else {
                    tv_craftEssenceListResponseOk.text = "craftEssenceListResponseOk $it NOK"
                }
            })
        }
        materialViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            materialListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_materialListResponseOk.text = "materialListResponseOk $it"
                } else {
                    tv_materialListResponseOk.text = "materialListResponseOk $it NOK"
                }
            })
        }
        mysticCodeViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            mysticCodeListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_mysticCodeListResponseOk.text = "mysticCodeListResponseOk $it"
                } else {
                    tv_mysticCodeListResponseOk.text = "mysticCodeListResponseOk $it NOK"
                }
            })
        }
        servantViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            servantListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_servantListResponseOk.text = "servantListResponseOk $it"
                } else {
                    tv_servantListResponseOk.text = "servantListResponseOk $it NOK"
                }
            })
        }
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LoadingFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LoadingFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}