package com.systemvertex.mobileversionofsvccwebsite.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.systemvertex.mobileversionofsvccwebsite.R

class ProductDetailFragment : Fragment() {

    private val productName: TextView?
        get() = view?.findViewById(R.id.product_name)

    private val productCategory: TextView?
        get() = view?.findViewById(R.id.product_category)

    private val productImage: ImageView?
        get() = view?.findViewById(R.id.product_img)

    private val productOverview: TextView?
        get() = view?.findViewById(R.id.product_overview)

    private val productBoxInclude: TextView?
        get() = view?.findViewById(R.id.product_box_include)

    private val endMessage: TextView?
        get() = view?.findViewById(R.id.end_message)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_product_detail, container, false)

        val productSelectionMessage = view.findViewById<TextView>(R.id.end_message)

        productSelectionMessage.text = getString(R.string.product_selection_message)


        // Inflate the layout for this fragment
        return view
    }

    fun setProductData(productId: Int) {

        when (productId) {
            R.id.pan_printer_1 -> {
                productName?.text = getString(R.string.pan_printer_1)
                productCategory?.text = getString(R.string.prod_category, "Laser AIO")
                productImage?.setImageResource(R.drawable.pan_printer_1_crop_5)
                productOverview?.text = getString(R.string.prod_overview, "\u2022 6-in-1 Laser AIO : Print | Copy | Color Scan | Fax | Network | Handset\n\n" +
                        " \u2022 24ppm (A4) High-speed Laser Printing\n \u2022 Up to 600×600 dpi Print Resolution\n\n" +
                        " \u2022 24cpm Copy Speed\n \u2022 Color Scan Capability\n \u2022 33.6 kbps Super G3 Fax\n\n" +
                        " \u2022 Handset Unit Supplied\n \u2022 250-sheet Capacity Input Tray\n\n" +
                        " \u2022 Automatic Document Feeder (ADF)\n")
                productBoxInclude?.text = getString(R.string.prod_box_include, "1 × Panasonic Laser AIO KX-MB2030CX\n 1 × Power Cord\n")
                endMessage?.text = getString(R.string.end_message)
            }
            R.id.pan_printer_2 -> {
                productName?.text = getString(R.string.pan_printer_2)
                productCategory?.text = getString(R.string.prod_category, "Laser AIO")
                productImage?.setImageResource(R.drawable.pan_printer_2_crop_1)
                productOverview?.text = getString(R.string.prod_overview, "Laser Printer\n" +
                        "• High-Speed 24ppm Print Speed\n" +
                        "• 600×600 dpi Resolution\n" +
                        "• 250-sheet Paper Capacity\n" +
                        "• USB 2.0 High Speed Interface\n" +
                        "• Works with Microsoft Windows 2000/XP/Vista/7, Mac OSX 10.3-10.5\n" +
                        "\nFlatbed Copier\n" +
                        "• Enhanced 600dpi Laser Copy Quality\n" +
                        "• Up to 24cpm Copy Speed\n" +
                        "• Multiple Copies: up to 99 from One Original\n" +
                        "• Enlarge up to 400%, Reduce up to 25%\n" +
                        "• Automatic Document Feeder (20 sheets)\n" +
                        "\nColor Scanner\n" +
                        "• Colour Scanning with Flatbed and Automatic Document Feeder\n" +
                        "9600 dpi (Interpolated) Scanning Capability\n" +
                        "• Scan to PC (via USB only)\n" +
                        "• Easy-to-Use Image Viewer\n" +
                        "\nLaser Fax\n" +
                        "• 33.6 kbps Super G3 Fax\n")
                productBoxInclude?.text = getString(R.string.prod_box_include, "1 × Panasonic Laser AIO KX-MB2025CX6\n" +
                        " 1 × Power Cord")
                endMessage?.text = getString(R.string.end_message)
            }
            R.id.pan_printer_3 -> {
                productName?.text = getString(R.string.pan_printer_3)
                productCategory?.text = getString(R.string.prod_category, "Laser AIO")
                productImage?.setImageResource(R.drawable.pan_printer_3)
                productOverview?.text = getString(R.string.prod_overview, "Panasonic KX-MB1530MLW is a 4-in-1 laser B&W AIO which " +
                        "an perform high-speed laser printing up to 18ppm (A4) with print resolution up to 600 × 600 dpi. It supports 33.6 kbps " +
                        "Super G3 Fax, color scan capability, and capable of perform document copy up to 18cpm. It also features Automatic Document " +
                        "Feeder (ADF).")
                productBoxInclude?.text = getString(R.string.prod_box_include, "1 × Panasonic Laser AIO KX-MB1530MLW\n" +
                        " 1 × Power Cord")
                endMessage?.text = getString(R.string.end_message)
            }
            R.id.pan_printer_4 -> {
                productName?.text = getString(R.string.pan_printer_4)
                productCategory?.text = getString(R.string.prod_category, "Laser AIO")
                productImage?.setImageResource(R.drawable.pan_printer_4)
                productOverview?.text = getString(R.string.prod_overview, "Panasonic KX-MB1520MLW is a 4-in-1 laser B&W AIO which can " +
                        "perform high-speed laser printing up to 18ppm (A4) with print resolution up to 600 × 600 dpi. It supports 33.6 kbps Super G3 " +
                        "Fax, color scan capability, and capable of perform document copy up to 18cpm.")
                productBoxInclude?.text = getString(R.string.prod_box_include, "1 × Panasonic Laser AIO KX-MB1520MLW\n" +
                        " 1 × Power Cord")
                endMessage?.text = getString(R.string.end_message)
            }
            R.id.pan_projector_1 -> {
                productName?.text = getString(R.string.pan_projector_1)
                productCategory?.text = getString(R.string.prod_category, "Projector")
                productImage?.setImageResource(R.drawable.pan_projector_1)
                productOverview?.text = getString(R.string.prod_overview, "Bright, compact and easy to use ‐ ideal for education and corporate uses. They also have a wide range of functions powered by a long lasting lamp. 2,800 lm, XGA.")
                productBoxInclude?.text = getString(R.string.prod_box_include, "1 × Projector (PT-LB280)\n" +
                        " 1 × Power Cord\n" +
                        " 1 × Wireless Remote Control Unit\n" +
                        " 2 × Batteries (AAA/R03/LR03 type)\n" +
                        " 1 × 1.5m VGA Cable")
                endMessage?.text = getString(R.string.end_message)
            }
            R.id.pan_projector_2 -> {
                productName?.text = getString(R.string.pan_projector_2)
                productCategory?.text = getString(R.string.prod_category, "Projector")
                productImage?.setImageResource(R.drawable.pan_projector_2)
                productOverview?.text = getString(R.string.prod_overview, "Bright, compact and easy to use ‐ ideal for education and corporate uses. They also have a wide range of functions powered by a long lasting lamp. 3,100 lm, XGA.")
                productBoxInclude?.text = getString(R.string.prod_box_include, "1 × Projector (PT-LB300)\n" +
                        " 1 × Power Cord\n" +
                        " 1 × Wireless Remote Control Unit\n" +
                        " 2 × Batteries (AAA/R03/LR03 type)\n" +
                        " 1 × 1.5m VGA Cable")
                endMessage?.text = getString(R.string.end_message)
            }
            R.id.pan_projector_3 -> {
                productName?.text = getString(R.string.pan_projector_3)
                productCategory?.text = getString(R.string.prod_category, "Projector")
                productImage?.setImageResource(R.drawable.pan_projector_3)
                productOverview?.text = getString(R.string.prod_overview, "Bright, compact and easy to use ‐ ideal for education and corporate uses. They also have a wide range of functions powered by a long lasting lamp. 3,700 lm, XGA.")
                productBoxInclude?.text = getString(R.string.prod_box_include, "1 × Projector (PT-LB360)\n" +
                        " 1 × Power Cord\n" +
                        " 1 × Wireless Remote Control Unit\n" +
                        " 2 × Batteries (AAA/R03/LR03 type)\n" +
                        " 1 × 1.5m VGA Cable\n" +
                        " 1 × Software CD-ROM")
                endMessage?.text = getString(R.string.end_message)
            }
            R.id.pan_phone_1 -> {
                productName?.text = getString(R.string.pan_phone_1)
                productCategory?.text = getString(R.string.prod_category, "Landline Phone")
                productImage?.setImageResource(R.drawable.pan_phone_1_crop)
                productOverview?.text = getString(R.string.prod_overview, "Panasonic KX-TS880ML is a new model that" +
                        " has much more features for business users. It is a single line phone that supports speaker phone" +
                        " and headset as well.")
                productBoxInclude?.text = getString(R.string.prod_box_include, "1 × Handset (KX-TS880ML)\n " +
                        "1 × Handset Cord\n 1 × Telephone Line Cord\n 1 × Operating Instruction Manual")
                endMessage?.text = getString(R.string.end_message)
            }
            R.id.pan_phone_2 -> {
                productName?.text = getString(R.string.pan_phone_2)
                productCategory?.text = getString(R.string.prod_category, "Landline Phone")
                productImage?.setImageResource(R.drawable.pan_phone_2_crop)
                productOverview?.text = getString(R.string.prod_overview, "Panasonic KX-TS500ML Single Line Phone is a basic ITS which are wall mountable and comes with 5 color options.")
                productBoxInclude?.text = getString(R.string.prod_box_include, "1 × Handset (KX-TS500ML)\n" +
                        " 1 × Handset Cord\n" +
                        " 1 × Telephone Line Cord")
                endMessage?.text = getString(R.string.end_message)
            }
            R.id.pan_phone_3 -> {
                productName?.text = getString(R.string.pan_phone_3)
                productCategory?.text = getString(R.string.prod_category, "Landline Phone")
                productImage?.setImageResource(R.drawable.pan_phone_3_crop)
                productOverview?.text = getString(R.string.prod_overview, "Panasonic Integrated Telephone System which compatible with Caller ID (required respective service subscription with service provider). It features with Hands-free Speaker Phone & can store 50 station phone book.\n" +
                        "\n")
                productBoxInclude?.text = getString(R.string.prod_box_include, "1 × Handset (KX-TS580ML)\n" +
                        " 1 × Handset Cord\n" +
                        " 1 × Telephone Line Cord\n" +
                        " 1 × Operating Instruction Manual")
                endMessage?.text = getString(R.string.end_message)
            }
            R.id.pan_phone_4 -> {
                productName?.text = getString(R.string.pan_phone_4)
                productCategory?.text = getString(R.string.prod_category, "Landline Phone")
                productImage?.setImageResource(R.drawable.pan_phone_4_crop)
                productOverview?.text = getString(R.string.prod_overview, "Panasonic KX-TS560ML Single Line Phone comes with compact & trendy design and in 2 colors available. It can store 50-station phonebook and able to redial in one-touch. For ringer selection you can choose between Off, Low and High. Additionally, it has call restriction feature and mountable on wall as well.")
                productBoxInclude?.text = getString(R.string.prod_box_include, "1 × Handset (KX-TS560ML)\n" +
                        " 1 × Handset Cord\n" +
                        " 1 × Telephone Line Cord\n" +
                        " 1 × Operating Instruction Manual")
                endMessage?.text = getString(R.string.end_message)
            }
            R.id.pan_phone_5 -> {
                productName?.text = getString(R.string.pan_phone_5)
                productCategory?.text = getString(R.string.prod_category, "Landline Phone")
                productImage?.setImageResource(R.drawable.pan_phone_5_crop)
                productOverview?.text = getString(R.string.prod_overview, "It come with ringer Indicator (Visual Lighted ringer indicator) with 3-One Touch Dialers and 3-Step Ringer Selector (Off/Low/High).It can be mount on wall.Beside it also got 6 step of handset Volume Control.It also got features on data Port, Last Number Redial (Call the last number dialled each time the redial button is pressed) and Switchable Tone/Pulse Setting (For compatibility with tone-actuated computer systems and any phone line).\n" +
                        "\n")
                productBoxInclude?.text = getString(R.string.prod_box_include, "1 × Handset (KX-TS520ML)\n" +
                        " 1 × Handset Cord\n" +
                        " 1 × Telephone Line Cord\n" +
                        " 1 × Operating Instruction Manual")
                endMessage?.text = getString(R.string.end_message)
            }
        }
    }

}