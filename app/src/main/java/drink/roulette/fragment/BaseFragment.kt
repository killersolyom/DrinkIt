package drink.roulette.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import butterknife.ButterKnife
import drink.roulette.communication.EventListener
import drink.roulette.model.event.Event

abstract class BaseFragment : Fragment(), EventListener {

    val TAG = this.javaClass.canonicalName
    private lateinit var mView: View

    override fun onCreateView(inflanter: LayoutInflater, container: ViewGroup?, b: Bundle?): View? {
        mView = inflanter.inflate(getLayoutId(), container, false)
        ButterKnife.bind(this, mView)
        onInitializationFinished()
        return mView
    }

    protected abstract fun onInitializationFinished()

    protected abstract fun getLayoutId(): Int


    override fun onEvent(event: Event?): Boolean {
        return false
    }

}