package com.designpatterns.creational.Prototype

class PersonDeepCopy : PersonShallowCopy
{


    // this is the overridden method
    public object Clone()
    {
    val  deep : PersonDeepCopy = this.MemberwiseClone()

        private fun MemberwiseClone(): PersonDeepCopy
        {
            return null
        }
        val address = this.Clone()
        return deep
}
}
