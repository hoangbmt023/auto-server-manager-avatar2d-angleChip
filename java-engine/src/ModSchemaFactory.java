import java.util.HashMap;
import java.util.Map;

/**
 * ModSchemaFactory
 * 
 * Factory & Registry for ModSchema strategies.
 * Enables Open-Closed Principle (OCP) - new mod versions can be registered
 * without modifying existing classes.
 */
public class ModSchemaFactory {

    private static final Map<ModSchema.ModType, IModSchema> STRATEGIES = new HashMap<ModSchema.ModType, IModSchema>();
    private static final Map<ModSchema.ModType, ModSchema> INSTANCES = new HashMap<ModSchema.ModType, ModSchema>();

    static {
        register(new UpxuBuild34Schema());
        register(new FishBuild40Schema());
        register(new ChipMixBuild13Schema());
    }

    public static void register(IModSchema strategy) {
        if (strategy != null) {
            STRATEGIES.put(strategy.getType(), strategy);
            INSTANCES.put(strategy.getType(), strategy.createSchema());
        }
    }

    public static ModSchema getSchema(ModSchema.ModType type) {
        ModSchema instance = INSTANCES.get(type);
        if (instance != null) {
            return instance;
        }
        IModSchema strategy = STRATEGIES.get(type);
        if (strategy != null) {
            instance = strategy.createSchema();
            INSTANCES.put(type, instance);
            return instance;
        }
        // Fallback default
        return INSTANCES.get(ModSchema.ModType.UP_XU);
    }
}
