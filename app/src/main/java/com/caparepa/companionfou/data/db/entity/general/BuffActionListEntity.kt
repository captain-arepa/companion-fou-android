package com.caparepa.companionfou.data.db.entity.general

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.general.buffaction.BuffActionParams
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(
    tableName = "buff_action_list"
)
data class BuffActionListEntity(
    @ColumnInfo(name = "command_atk")
    val commandAtk: String? = null,
    @ColumnInfo(name = "command_def")
    val commandDef: String? = null,
    @ColumnInfo(name = "atk")
    val atk: String? = null,
    @ColumnInfo(name = "defence")
    val defence: String? = null,
    @ColumnInfo(name = "defence_pierce")
    val defencePierce: String? = null,
    @ColumnInfo(name = "specialdefence")
    val specialdefence: String? = null,
    @ColumnInfo(name = "damage")
    val damage: String? = null,
    @ColumnInfo(name = "damage_individuality")
    val damageIndividuality: String? = null,
    @ColumnInfo(name = "damage_individuality_activeonly")
    val damageIndividualityActiveonly: String? = null,
    @ColumnInfo(name = "selfdamage")
    val selfdamage: String? = null,
    @ColumnInfo(name = "critical_damage")
    val criticalDamage: String? = null,
    @ColumnInfo(name = "npdamage")
    val npdamage: String? = null,
    @ColumnInfo(name = "given_damage")
    val givenDamage: String? = null,
    @ColumnInfo(name = "receive_damage")
    val receiveDamage: String? = null,
    @ColumnInfo(name = "pierce_invincible")
    val pierceInvincible: String? = null,
    @ColumnInfo(name = "invincible")
    val invincible: String? = null,
    @ColumnInfo(name = "break_avoidance")
    val breakAvoidance: String? = null,
    @ColumnInfo(name = "avoidance")
    val avoidance: String? = null,
    @ColumnInfo(name = "overwrite_battleclass")
    val overwriteBattleclass: String? = null,
    @ColumnInfo(name = "overwrite_classrelatio_atk")
    val overwriteClassrelatioAtk: String? = null,
    @ColumnInfo(name = "overwrite_classrelatio_def")
    val overwriteClassrelatioDef: String? = null,
    @ColumnInfo(name = "command_np_atk")
    val commandNpAtk: String? = null,
    @ColumnInfo(name = "command_np_def")
    val commandNpDef: String? = null,
    @ColumnInfo(name = "drop_np")
    val dropNp: String? = null,
    @ColumnInfo(name = "drop_np_damage")
    val dropNpDamage: String? = null,
    @ColumnInfo(name = "command_star_atk")
    val commandStarAtk: String? = null,
    @ColumnInfo(name = "command_star_def")
    val commandStarDef: String? = null,
    @ColumnInfo(name = "critical_point")
    val criticalPoint: String? = null,
    @ColumnInfo(name = "starweight")
    val starweight: String? = null,
    @ColumnInfo(name = "turnend_np")
    val turnendNp: String? = null,
    @ColumnInfo(name = "turnend_star")
    val turnendStar: String? = null,
    @ColumnInfo(name = "turnend_hp_regain")
    val turnendHpRegain: String? = null,
    @ColumnInfo(name = "turnend_hp_reduce")
    val turnendHpReduce: String? = null,
    @ColumnInfo(name = "gain_hp")
    val gainHp: String? = null,
    @ColumnInfo(name = "turnval_np")
    val turnvalNp: String? = null,
    @ColumnInfo(name = "grant_state")
    val grantState: String? = null,
    @ColumnInfo(name = "resistance_state")
    val resistanceState: String? = null,
    @ColumnInfo(name = "avoid_state")
    val avoidState: String? = null,
    @ColumnInfo(name = "donot_act")
    val donotAct: String? = null,
    @ColumnInfo(name = "donot_skill")
    val donotSkill: String? = null,
    @ColumnInfo(name = "donot_noble")
    val donotNoble: String? = null,
    @ColumnInfo(name = "donot_recovery")
    val donotRecovery: String? = null,
    @ColumnInfo(name = "individuality_add")
    val individualityAdd: String? = null,
    @ColumnInfo(name = "individuality_sub")
    val individualitySub: String? = null,
    @ColumnInfo(name = "hate")
    val hate: String? = null,
    @ColumnInfo(name = "critical_rate")
    val criticalRate: String? = null,
    @ColumnInfo(name = "avoid_instantdeath")
    val avoidInstantdeath: String? = null,
    @ColumnInfo(name = "resist_instantdeath")
    val resistInstantdeath: String? = null,
    @ColumnInfo(name = "nonresist_instantdeath")
    val nonresistInstantdeath: String? = null,
    @ColumnInfo(name = "regain_np_used_noble")
    val regainNpUsedNoble: String? = null,
    @ColumnInfo(name = "function_dead")
    val functionDead: String? = null,
    @ColumnInfo(name = "maxhp_rate")
    val maxhpRate: String? = null,
    @ColumnInfo(name = "maxhp_value")
    val maxhpValue: String? = null,
    @ColumnInfo(name = "function_wavestart")
    val functionWavestart: String? = null,
    @ColumnInfo(name = "function_selfturnend")
    val functionSelfturnend: String? = null,
    @ColumnInfo(name = "give_gain_hp")
    val giveGainHp: String? = null,
    @ColumnInfo(name = "function_commandattack")
    val functionCommandattack: String? = null,
    @ColumnInfo(name = "function_deadattack")
    val functionDeadattack: String? = null,
    @ColumnInfo(name = "function_entry")
    val functionEntry: String? = null,
    @ColumnInfo(name = "chagetd")
    val chagetd: String? = null,
    @ColumnInfo(name = "grant_substate")
    val grantSubstate: String? = null,
    @ColumnInfo(name = "tolerance_substate")
    val toleranceSubstate: String? = null,
    @ColumnInfo(name = "grant_instantdeath")
    val grantInstantdeath: String? = null,
    @ColumnInfo(name = "function_damage")
    val functionDamage: String? = null,
    @ColumnInfo(name = "function_reflection")
    val functionReflection: String? = null,
    @ColumnInfo(name = "multiattack")
    val multiattack: String? = null,
    @ColumnInfo(name = "give_np")
    val giveNp: String? = null,
    @ColumnInfo(name = "resistance_delay_npturn")
    val resistanceDelayNpturn: String? = null,
    @ColumnInfo(name = "pierce_defence")
    val pierceDefence: String? = null,
    @ColumnInfo(name = "guts_hp")
    val gutsHp: String? = null,
    @ColumnInfo(name = "funcgain_np")
    val funcgainNp: String? = null,
    @ColumnInfo(name = "func_hp_reduce")
    val funcHpReduce: String? = null,
    @ColumnInfo(name = "function_npattack")
    val functionNpattack: String? = null,
    @ColumnInfo(name = "fix_commandcard")
    val fixCommandcard: String? = null,
    @ColumnInfo(name = "donot_gainnp")
    val donotGainnp: String? = null,
    @ColumnInfo(name = "field_individuality")
    val fieldIndividuality: String? = null,
    @ColumnInfo(name = "donot_act_commandtype")
    val donotActCommandtype: String? = null,
    @ColumnInfo(name = "damage_event_point")
    val damageEventPoint: String? = null
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

    fun String.getBuffActionParams(): BuffActionParams? {
        return this.toKotlinObject()
    }
}