package chaussia.shared.building.production;

import java.util.List;

import chaussia.shared.Const;
import chaussia.shared.building.BuildingType;
import chaussia.shared.material.MaterialType;
import chaussia.shared.material.Stock;
import chaussia.shared.units.UnitType;

public class WeavingMill extends AbstractProductionBuilding
{

    private static final long serialVersionUID = 1L;

    @Override
    public MaterialType getMaterial()
    {
        return MaterialType.FABRIC;
    }

    @Override
    public UnitType getUnitType()
    {
        return UnitType.WORKER;
    }

    @Override
    public void resetUpgradePeriod()
    {
        this.setupgradeperiod(Const.UPGRADE_PRODUCTION2);
    }

    @Override
    public void resetConstructionPeriod()
    {
        this.setConstructionperiod(Const.CONSTRUCTIONPERIOD_PRODUCTION2);
    }

    @Override
    public List<BuildingType> getRequiredBuildings()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Stock getConstructionCost()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BuildingType getType()
    {
        return BuildingType.WEAVINGMILL;
    }

}
