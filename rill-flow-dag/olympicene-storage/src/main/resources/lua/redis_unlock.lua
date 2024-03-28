--redis_unlock.lua
if redis.call("get", KEYS[1]) == ARGV[1] then
    -- FIXME: Code Completion From Here.
else
    return 0
end
