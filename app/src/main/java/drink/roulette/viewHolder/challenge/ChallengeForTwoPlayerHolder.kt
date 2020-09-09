package drink.roulette.viewHolder.challenge

import android.view.View
import drink.roulette.model.questions.challenge.TwoPlayerChallenge

open class ChallengeForTwoPlayerHolder(itemView: View) :
    BaseChallengeHolder<TwoPlayerChallenge>(itemView) {
    override fun getItemText(item: TwoPlayerChallenge): String {
        return item.getChallengeDescription()
    }
}